public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("Pepe");
        Director d2 = new Director("Cabesa");
        Fecha f1 = new Fecha(17,4,2018);
        Fecha f2 = new Fecha(18,4,2018);
        Tienda t1 = new Tienda();
        Videojuego v1 = new Videojuego("CSGOOO","FPS", d1,f2);
        Videojuego v2 = new Videojuego("Gambisimaaaaa","GambaForce", d1, f2);
        Videojuego v3 = new Videojuego("Peeew","Ay",d2,f2);
        t1.agregar(v1);
        t1.agregar(v2);
        t1.agregar(v3);

        v1.esGeneroYDirector("FPS",d1);
        d1.agregar(v1);
        d1.agregar(v2);
        System.out.println(d1.buscarJuego(v3));
        System.out.println(t1.juegosLanzamiento(f2));
        System.out.println(t1.shortNames());
        System.out.println(v1.añosEnMercado());
    }
}
