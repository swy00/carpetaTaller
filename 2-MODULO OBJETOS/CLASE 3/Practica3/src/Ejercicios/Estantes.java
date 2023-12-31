/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros.
 */
package Ejercicios;

/**
 *
 * @author franc
 */
public class Estantes {
    private Libro[] libros;
    //Para llevar la cuenta de cuantos libros hay en el estante
    private int cantLibros=0;
    
    //CONSTRUCTOR DE ESTANTE SIN LIBROS
    public Estantes(){
        libros = new Libro[20];
    }

    public int getCantLibros() {
        return this.cantLibros;
    }

    public Libro[] getLibros() {
        return this.libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro unLibro){
        if (cantLibros < 20){
            this.libros[cantLibros]=unLibro;
            cantLibros++;
        }
        else{
            System.out.println("El estante está completo");
        }
    }
    public boolean estaLleno(){
        return (!(this.cantLibros<20));
    }
    
    public String encontrarLibro(String unNombre){
        //Recorro el estante checkeando el nombre
        int pos=-1;
        boolean existe=false;
        
        for (int i = 0; i < this.cantLibros; i++) {
            if (this.libros[i].getTitulo().equals(unNombre)){
                existe=true;
                pos=i;
            }   
        }
        return (existe) ? this.libros[pos].toString() : "El libro no se encontró";
    }
}
