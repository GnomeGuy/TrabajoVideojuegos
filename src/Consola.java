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

    public void diversidad(){
        int count = 0;
        ArrayList<Videojuego> categorias = new ArrayList<>();
        Videojuego aux;
        for (int i = 0; i < juegosCompatibles.size(); i++){
            for (int a = 0; a < juegosCompatibles.size();a++){
            if (!juegosCompatibles.get(i).genero.equals(juegosCompatibles.get(a).genero) && !categorias.contains(juegosCompatibles.get(a))){
             count++;
             categorias.add(juegosCompatibles.get(a));
            }
        }
        }
        if (count>=10){
            System.out.println("La consola tiene diversidad.");
        }
        else{
            System.out.println("La consola no tiene diversidad.");
            }
    }
    public Consola(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Videojuego v){
        juegosCompatibles.add(v);
    }
}