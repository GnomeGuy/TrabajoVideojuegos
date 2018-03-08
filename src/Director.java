import java.util.ArrayList;
import java.util.Iterator;

public class Director {

    String nombre;
    ArrayList<Videojuego> games = new ArrayList<>();
    Videojuego siguiente;

    public Director(String nombre) {
        this.nombre = nombre;
    }


    // Da siempre el mismo juego. Por solucionar
    public Videojuego otroJuego(){
        Iterator it = games.iterator();
        if (it.hasNext()){
            return (Videojuego) it.next();
        }
        else {
            return null;
        }
    }

    public void agregar(Videojuego v){
        games.add(v);
    }
}
