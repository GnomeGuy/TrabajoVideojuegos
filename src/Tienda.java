import java.util.ArrayList;

public class Tienda {

    ArrayList<Videojuego> stock = new ArrayList<>();

    public ArrayList<Videojuego> juegosLanzamiento(Fecha fecha){
        ArrayList<Videojuego> lanzamiento = new ArrayList<>();
        for (Videojuego v: stock){
            if (v.lanzamiento.before(fecha) || v.lanzamiento.equals(fecha)){
                lanzamiento.add(v);
            }
        }
        return lanzamiento;
    }

    public void agregar(Videojuego v){
        stock.add(v);
    }
}
