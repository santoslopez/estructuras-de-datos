import java.util.Hashtable;
import java.util.*;
public class HashtableExample1{

  public static void main(String[] args){
    HashtableExample1 e = new HashtableExample1();
    e.iniciar();
  }

  public void iniciar(){
    Hashtable <Integer,String> h = new Hashtable<Integer,String>();
    /*agregando elementos al hastable*/
    h.put(1,"Tom y Jerry");//primer elemento agregado
    h.put(2,"Keep up your hard work, and go Bears!");
    h.put(3,"Kristina Basham");
    h.put(4,"Tienes que encontrar la forma de estar relajado en el peor de los casos");//ultimo elemento agregado
    h.put(5,"Asume siempre lo peor");
    h.put(6,"Harvard University");
    h.put(7,"Santos Lopez");
    h.put(8,"CS50");//ultimo elemento agregado

    /*Desplegamos todos los valores del hastable. Su key y dato.
    En el hastable se empieza a imprimir desde el ultimo al primer elemento
    */
    System.out.println(h);

    /*devolvemos el nombre que posea esta clave y para eso le indicamos el valor de la llave*/
    System.out.println(h.get(123));

    /*Cantidad de elementos*/
    System.out.println(h.size());

    /*eliminar elemento del hastable. Le indicamos la clave del elemento a eliminar*/
    h.remove(16);

    /*desplegamos los valores del hastable sin el elemento eliminado*/
    System.out.println(h);

    /*verificar si el hashtable contiene cierta llave*/
    if(h.containsKey(123)){
      System.out.println("La llave existe");
    }else{
      System.out.println("Esta llave no existe");
    }

    /*verificar si el hashtable contiene cierto valor o texto*/
    if(h.containsValue("Santos Lopez")){
      System.out.println("El texto existe");
    }else{
      System.out.println("El texto no existe");
    }


    recorrerTablaHash(h);

  }

  /*recorremos el hashtable y desplegamos sus textos*/
  private void recorrerTablaHash(Hashtable<Integer,String> table){
    System.out.println();

    /*recorrer y desplegar textos del hashtable*/
    Enumeration<String> enumeration = table.elements();
    while(enumeration.hasMoreElements()){
      System.out.println("Texto: "+enumeration.nextElement());
    }
    System.out.println("");

    /*recorrer y desplegar key del hashtable*/
    Enumeration<Integer> enumerationKeys = table.keys();
    while(enumerationKeys.hasMoreElements()){
      System.out.println("Llave: "+enumerationKeys.nextElement());
    }
  }

}
