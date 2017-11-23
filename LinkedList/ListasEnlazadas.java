//vamos a utilizar las cosas que ya existen
import java.util.LinkedList;

public class ListasEnlazadas{

  private static LinkedList lista = new LinkedList();

  //devolvemos la lista. Si la lista estuviera vacia devolvemos []
  public static LinkedList getLista(){
    return lista;
  }

  //metodo principal
  public static void main(String[] args) {
    //para agregar datos a la lista invocamos al metodo add propio de LinkedList
    lista.add("Kristina Basham.");
    lista.add("Daniela Fainus");
    lista.add("Seleccion de Argentina");
    lista.add("FC Barcelona");
    lista.add(22);

    //si queremos agregar un elemento en cierto indice (estamos agregando el numero 100 al indice 1)
    lista.add(1,100);

    //si queremos saber el tamano de la lista
    System.out.println("El tamano de nuestra lista es : "+lista.size() + ", o sea es el numero de elementos que tenemos.");


    //si queremos imprimir cierto elemento de nuestra lista
    System.out.println(lista.get(0));


    //si queremos obtener variables de cierto indice
    System.out.println(lista.get(2));

    //si queremos obtener el primer valor de la lista
    System.out.println(lista.getFirst());

    //si queremos obtener el ultimos valor de la lista
    System.out.println(lista.getLast());

    //otra forma de obtener el ultimo valor de la lista
    System.out.println(lista.size()-1);

    //si queremos agregar un elemento en el primer indice
    lista.addFirst("Hola Guatemala!!!");

    //si queremos eliminar un elemento en la lista
    lista.remove("FC Barcelona");

    //imprimimos nuestra lista
    System.out.println(getLista());
  }
}
