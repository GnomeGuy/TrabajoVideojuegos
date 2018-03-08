import java.util.ArrayList;

public class Consola {

    String nombre;
    ArrayList<Videojuego> juegosCompatibles = new ArrayList<>();


    public Consola(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Videojuego v){
        juegosCompatibles.add(v);
    }
}