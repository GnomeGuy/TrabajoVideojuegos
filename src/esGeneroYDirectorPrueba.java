import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class esGeneroYDirectorPrueba extends Contador{


    static Videojuego v1;
    static Videojuego v2;
    static Director d1;
    static Director d2;

    @BeforeAll
    static void creacion() {
        d1 = new Director("Paco");
        d2  = new Director("Pepe");
        Fecha f1 = new Fecha();
        v1 = new Videojuego("CSGO", "FPS", d1, f1);
        v2 = null;
    }


    @AfterEach
    void afterEach() {
        super.afterEach();
    }

    @AfterAll
    static void nulear(){
        v1 = null;
        v2 = null;
        d1 = null;
        d2 = null;
    }

    @DisplayName("Prueba que comprueba que sea correcto con el mismo genero y director.")
    @Test
    void pruebaUno(){
        String resultadoEsperado = "Es del mismo genero y del mismo director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector("FPS", d1));
    }



    @DisplayName("Prueba que comprueba que sea correcto sin el mismo genero, pero con el mismo director.")
    @Test
    void pruebaDos(){
        String resultadoEsperado = "No es del mismo genero, pero si es del mismo director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector("Estrategia",d1));
    }

    @DisplayName("Prueba que comprueba que sea correcto sin el mismo director, pero con el mismo genero.")
    @Test
    void pruebaTres(){
        String resultadoEsperado = "Es del mismo genero, pero no es del mismo director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector("FPS", d2));
    }


    @DisplayName("Prueba que comprueba que sea correcto sin el mismo genero, ni el mismo director.")
    @Test
    void pruebaCuatro(){
        String resultadoEsperado = "No es ni del mismo genero, ni del mismo director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector("Estrategia", d2));
    }

    @DisplayName("Prueba que comprueba que sea correcto añadiendo null al director.")
    @Test
    void pruebaCinco(){
        String resultadoEsperado = "Error - El genero o el director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector("FPS", null));
    }


    @DisplayName("Prueba que comprueba que sea correcto añadiendo null al genero.")
    @Test
    void pruebaSeis(){
        String resultadoEsperado = "Error - El genero o el director";
        assertEquals(resultadoEsperado, v1.esGeneroYDirector(null, d1));
    }
}
