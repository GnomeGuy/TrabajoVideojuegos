import java.util.ArrayList;

public class Videojuego {

    String nombre;
    String genero;
    Director director;
    Fecha lanzamiento;

    public Videojuego(String nombre,String genero, Director director, Fecha lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.lanzamiento = lanzamiento;
    }

    public void esGeneroYDirector(String gen, Director dic){
        if (genero.equals(gen) && director.equals(dic)){
            System.out.println("Es del mismo genero y del mismo director");
        }
        if (!genero.equals(gen) && director.equals(dic)){
            System.out.println("No es del mismo genero, pero si es del mismo director");
        }
        if (genero.equals(gen) && !director.equals(dic)){
            System.out.println("Es del mismo genero, pero no es del mismo director");
        }
        if (!genero.equals(gen) && !director.equals(dic)){
            System.out.println("No es ni del mismo genero, ni del mismo director");
        }
    }

    public Fecha getLanzamiento() {
        return lanzamiento;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
