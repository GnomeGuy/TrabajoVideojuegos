import java.util.ArrayList;
import java.util.Iterator;

public class Director {

    String nombre;
    ArrayList<Videojuego> games = new ArrayList<>();

    public Director(String nombre) {
        this.nombre = nombre;
    }


    // Da siempre el mismo juego. Por solucionar
    public Videojuego buscarJuego(Videojuego game) {
        for (Videojuego v: games){
            if (v.equals(game)){
                return v;
            }
        }
        return null;
    }

    public void agregar(Videojuego v){
        games.add(v);
    }
}
