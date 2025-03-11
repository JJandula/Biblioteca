public class Libro extends MaterialBiblioteca implements Prestable{
    
    boolean prestado;
    
    public Libro(String titulo, String autor, int anyoPublicacion,boolean prestado){
        super(titulo,autor,anyoPublicacion);
        this.prestado = prestado;
    };
    



    /* METODOS DE LA INTERFAZ */

    @Override
    public void prestar(){
        System.out.println("Libro prestado");  
    };
    
    @Override
    public void devolver(){
        System.out.println("Libro devuelto");
    };

    @Override
    public void estaPrestado(){
        System.out.println("¿Este libro esta prestado?");
    };

    /* METODO ABSTRACTO DE MATERIALPRESTADO */
    
    @Override
    public void mostrarInfo(){
        System.out.println(
        "Titulo:"+ getTitulo() +
        "\nAutor:"+ getAutor() +
        "\nAño de publicación: " + getAnyoPublicacion());
    };

}
