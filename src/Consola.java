import java.util.ArrayList;

public class Consola {

    String nombre;
    ArrayList<Videojuego> juegosCompatibles = new ArrayList<>();

    // Método que te indique si una consola tiene videojuegos del mismo género del videojuego devuelto.
    public boolean tieneGenero(Videojuego game){
        for (Videojuego v: juegosCompatibles){
            if (v.genero.equals(game.genero)){
                return true;
            }
        }
        return false;
    }

    public Consola(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Videojuego v){
        juegosCompatibles.add(v);
    }
}