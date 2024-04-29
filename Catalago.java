import java.util.ArrayList;
/**
 * Write a description of class Catalago here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catalago
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> libros;

    /**
     * crea la lista 
     */
    public Catalago()
    {
        // initialise instance variables
        libros = new ArrayList<>();
    }

    /**
     * agregamos un libro
     */
    public void agregarLibro(Book libro)
    {
        libros.add(libro);
    }
    
    /**
     * permite eliminar un libro pasando como parametro el indice
     */
    public void eliminarLibroPorIndice(int index){
    assert (index >=0 && index < libros.size()):"el indice no existe";
    libros.remove(index);
    }
    
    /**
     * permite eliminar un libro buscandolo
     */
    public void eliminarLibro(Book libro){
    int index=0;
    boolean encontrado=false;
    while (!encontrado && index < libros.size()){
      if(libros.get(index).equals(libro)){
        libros.remove(index);
        encontrado=true;
        }
        index++;
    }
    if(!encontrado){
        System.out.println("no existe el libro");
    }else{
         System.out.println("Libro borrado con exito");
    }
    }
    
    /**
     * metodo para imprimir el catalogo
     */
    public void imprimirCatalogo(){
    assert (libros.size()==0):"el catalogo esta vacio";
    for (Book unLibro:libros){
       System.out.println(unLibro.toString());
    }
    }
     
    
}
