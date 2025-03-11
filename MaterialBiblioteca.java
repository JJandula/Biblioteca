
abstract public class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int anyoPublicacion;

    /* CONSTRUCTOR */

    public MaterialBiblioteca (String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;

    }
    /* GETTERS */

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnyoPublicacion(){
        return anyoPublicacion;
    }

    /* SETTERS */

    public void setTitulo(){
        this.titulo = titulo;
    }

    public void setAutor(){
        this.autor = autor;
    }

    public void setAnyoPublicacion(){
        this.anyoPublicacion = anyoPublicacion;
    }



    /* METODO ABSTRACTO */

    abstract void mostrarInfo();
    
}



