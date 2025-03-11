public class Revista extends MaterialBiblioteca{

    int numeroEdicion;
    
    public Revista(String titulo, String autor, int anyoPublicacion, int numeroEdicion){
        super(titulo,autor,anyoPublicacion);
        this.numeroEdicion = numeroEdicion;
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
