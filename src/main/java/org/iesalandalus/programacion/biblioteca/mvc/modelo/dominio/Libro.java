package org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio;

import java.util.Objects;

public class Libro {

	private static final int PAGINAS_PARA_RECOMPENSA = 25;
	private static final float PUNTOS_PREMIO = 0.5f;

	private String titulo;
	private String autor;
	private int numPaginas;

	public Libro(String titulo, String autor, int numPaginas) {

		setTitulo(titulo);
		setAutor(autor);
		setNumPaginas(numPaginas);
	}

	public Libro(Libro libro) {

		if (libro == null) {

			throw new NullPointerException("ERROR: No es posible copiar un libro nulo.");
		}

		setTitulo(libro.getTitulo());
		setAutor(libro.getAutor());
		setNumPaginas(libro.getNumPaginas());
	}

	public static Libro getLibroFicticio(String titulo, String autor) {

		return new Libro(titulo, autor, 471);
	}

	public String getTitulo() {

		return titulo;
	}

	private void setTitulo(String titulo) {

		if (titulo == null) {

			throw new NullPointerException("ERROR: El título no puede ser nulo.");

		} else if (titulo.trim().equals("")) {

			throw new IllegalArgumentException("ERROR: El título no puede estar vacío.");
		}

		this.titulo = titulo;
	}

	public String getAutor() {

		return autor;
	}

	private void setAutor(String autor) {

		if (autor == null) {

			throw new NullPointerException("ERROR: El autor no puede ser nulo.");

		} else if (autor.trim().equals("")) {

			throw new IllegalArgumentException("ERROR: El autor no puede estar vacío.");
		}

		this.autor = autor;
	}

	public int getNumPaginas() {

		return numPaginas;
	}

	private void setNumPaginas(int numPaginas) {

		if (numPaginas <= 0) {

			throw new IllegalArgumentException("ERROR: El número de páginas debe ser mayor que cero.");
		}

		this.numPaginas = numPaginas;
	}

	public float getPuntos() {

		float puntosGanados;

		puntosGanados = (float) (Math.ceil(((double) getNumPaginas() + 1) / PAGINAS_PARA_RECOMPENSA) * PUNTOS_PREMIO);

		return puntosGanados;
	}

	@Override
	public int hashCode() {

		return Objects.hash(titulo, autor);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;
		}

		if (!(obj instanceof Libro)) {

			return false;
		}

		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo) && Objects.equals(autor, other.autor);
	}

	@Override
	public String toString() {

		return String.format("título=%s, autor=%s, número de páginas=%s", titulo, autor, numPaginas);
	}
}
