public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("Pepe");
        Director d2 = new Director("Cabesa");
        Fecha f1 = new Fecha(17,4,2018);
        Fecha f2 = new Fecha(18,4,2018);
        Videojuego v1 = new Videojuego("CSGOOO","FPS", d1,f2);
        Videojuego v2 = new Videojuego("Gambisimaaaaa","GambaForce", d1, f2);
        Videojuego v3 = new Videojuego("Peeew","Ay",d2,f2);
        Videojuego v4 = new Videojuego("Yay","baby",d2,f2);
        Videojuego v5 = new Videojuego("ey","ey",d2,f2);
        Videojuego v6 = new Videojuego("aaa","aa",d2,f2);
        Videojuego v7 = new Videojuego("aaaaaaaaa","ooooo", d2,f2);
        Videojuego v8 = new Videojuego("asa","memes",d2,f2);
        Videojuego v9 = new Videojuego("rip","rest",d2,f2);
        Videojuego v10 = new Videojuego("Cadiz Simulator", "Best team",d2,f2);
        Consola c1 = new Consola("PepeGameX");
        c1.agregar(v1);
        c1.agregar(v2);
        c1.agregar(v3);
        c1.agregar(v4);
        c1.agregar(v5);
        c1.agregar(v6);
        c1.agregar(v7);
        c1.agregar(v8);
        c1.agregar(v9);
        c1.agregar(v10);
        c1.diversidad();
    }
}
