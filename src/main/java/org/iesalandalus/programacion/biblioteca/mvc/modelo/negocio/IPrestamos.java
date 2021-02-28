package org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Alumno;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Curso;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Libro;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Prestamo;

public interface IPrestamos {

	List<Prestamo> get();

	int getTamano();

	List<Prestamo> get(Alumno alumno);

	List<Prestamo> get(Libro libro);

	List<Prestamo> get(LocalDate fecha);

	Map<Curso, Integer> getEstadisticaMensualPorCurso(LocalDate mes);

	void prestar(Prestamo prestamo) throws OperationNotSupportedException;

	void devolver(Prestamo prestamo, LocalDate fechaDevolver) throws OperationNotSupportedException;

	Prestamo buscar(Prestamo prestamo);

	void borrar(Prestamo prestamo) throws OperationNotSupportedException;

}