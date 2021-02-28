package org.iesalandalus.programacion.biblioteca.mvc.vista.texto;

public enum Opcion {

	INSERTAR_ALUMNO("Insertar alumno") {

		public void ejecutar() {

			vista.insertarAlumno();
		}
	},

	BUSCAR_ALUMNO("Buscar alumno") {

		public void ejecutar() {

			vista.buscarAlumno();
		}
	},

	BORRAR_ALUMNO("Borrar alumno") {

		public void ejecutar() {

			vista.borrarAlumno();
		}
	},

	LISTAR_ALUMNOS("Listar alumnos") {

		public void ejecutar() {

			vista.listarAlumnos();
		}
	},

	INSERTAR_LIBRO("Insertar libro") {

		public void ejecutar() {

			vista.insertarLibro();
		}
	},

	BUSCAR_LIBRO("Buscar libro") {

		public void ejecutar() {

			vista.buscarLibro();
		}
	},

	BORRAR_LIBRO("Borrar libro") {

		public void ejecutar() {

			vista.borrarLibro();
		}
	},

	LISTAR_LIBROS("Listar libros") {

		public void ejecutar() {

			vista.listarLibros();
		}
	},

	PRESTAR_LIBRO("Prestar libro") {

		public void ejecutar() {

			vista.prestarLibro();
		}
	},

	DEVOLVER_LIBRO("Devolver libro") {

		public void ejecutar() {

			vista.devolverLibro();
		}
	},

	BUSCAR_PRESTAMO("Buscar prestamo") {

		public void ejecutar() {

			vista.buscarPrestamo();
		}
	},

	BORRAR_PRESTAMO("Borrar prestamo") {

		public void ejecutar() {

			vista.borrarPrestamo();
		}
	},

	LISTAR_PRESTAMOS("Listar prestamos") {

		public void ejecutar() {

			vista.listarPrestamos();
		}
	},

	LISTAR_PRESTAMOS_ALUMNO("Listar prestamos por alumno") {

		public void ejecutar() {

			vista.listarPrestamosAlumno();
		}
	},

	LISTAR_PRESTAMOS_LIBRO("Listar prestamos por libro") {

		public void ejecutar() {

			vista.listarPrestamosLibro();
		}
	},

	LISTAR_PRESTAMOS_FECHA("Listar alumno por fecha") {

		public void ejecutar() {

			vista.listarPrestamosFecha();
		}
	},

	MOSTRAR_ESTADISTICA_MENSUAL_POR_CURSO("Mostrar estadistica mensual por curso") {

		public void ejecutar() {

			vista.mostrarEstadisticaMensualPorCurso();
		}
	},

	SALIR("Salir") {

		public void ejecutar() {

			vista.terminar();
		}
	};

	private static VistaTexto vista;
	private String mensaje;

	private Opcion(String mensaje) {

		this.mensaje = mensaje;
	}

	public abstract void ejecutar();

	protected static void setVista(VistaTexto vista) {

		Opcion.vista = vista;
	}

	public static Opcion getOpcionSegunOridnal(int ordinal) {

		if (esOrdinalValido(ordinal)) {

			return values()[ordinal];

		} else {

			throw new IllegalArgumentException("Ordinal de la opción no válido");
		}
	}

	public static boolean esOrdinalValido(int ordinal) {

		return (ordinal >= 0 && ordinal <= values().length - 1);
	}

	@Override
	public String toString() {

		return String.format("%d.- %s", ordinal(), mensaje);
	}
}
