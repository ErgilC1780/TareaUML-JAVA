public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;

    public Personaje(String nombre, String descripcion, long tamaño, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.tamaño = tamaño;
        this.vida = vida;
    }


    public void desplazarse(){

    }
    public int mostrarVida(){

        return 0;
    }
    public void mostrarPoder(){

    }



}
