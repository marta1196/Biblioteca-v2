package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.AlumnoTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.AudioLibroTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.CursoTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.LibroEscritoTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.PrestamoTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.memoria.AlumnosTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.memoria.LibrosTest;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.memoria.PrestamosTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlumnoTest.class, AudioLibroTest.class, LibroEscritoTest.class, PrestamoTest.class, CursoTest.class,
				AlumnosTest.class, LibrosTest.class, PrestamosTest.class,
				ModeloMemoriaTest.class })
public class AllTests {

}
