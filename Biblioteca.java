import java.util.ArrayList;

public class Biblioteca {
    ArrayList<MaterialBiblioteca> materiales = new ArrayList();

    public void agregarMaterial(String titulo, String autor, int anyoPublicacion, boolean prestado, int numeroEdicion) {

        this.materiales.add(new Libro(titulo, autor, anyoPublicacion, prestado));

        this.materiales.add(new Revista(titulo, autor, anyoPublicacion, numeroEdicion));

        System.out.println("Materiales añadidos al ArrayList...");
    }

    public void eliminarMaterial(String titulo) {
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().equals(titulo)) {
                materiales.remove(material);
                System.out.println("Material eliminado...");
                break;
            }
        }
    }

    public void mostrarMateriales() {

        if(materiales.isEmpty()){
            System.out.println("Array vacio...");
        }else{
            for (MaterialBiblioteca material : materiales) {
                System.out.println(material);
            }
        }

    }

    public void buscarMaterial(String titulo) {
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().equals(titulo)) {
                System.out.println(material);
                break;
            }
        }
    }
}
