/*Algunas clases solo se reescribieron para practicar su funcionamiento y se hace con fines educativos
Inspirado en https://jarroba.com/arraylist-en-java-ejemplos/
*/

import java.util.ArrayList;

public class EjemploArrayList{

  public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<String>(10);
    ArrayList<Integer> edades = new ArrayList<Integer>(5);

    System.out.println("Se agregaron algunos elementos al ArrayList de tipo String\nnombreArrayList.add(tipoDato)\n");
    //agregando datos al ArrayList con tipo de dato String
    nombres.add("Santos");
    nombres.add("Maria");
    nombres.add("Jimena");
    nombres.add("Esteban");
    nombres.add("Katherine");
    nombres.add("Taylor");
    nombres.add("Brian");
    System.out.println("Se agregaron algunos elementos al ArrayList de tipo String\nnombreArrayList.add(tipoDato)\n");
    //agregamos datos al ArrayList con tipo de dato entero
    edades.add(200);
    edades.add(20);
    edades.add(15);
    edades.add(56);
    edades.add(17);
    edades.add(11);

    //imprimiendo los datos de los ArrayList
    System.out.println("Imprimiendo ambos ArrayList");
    System.out.println(nombres);
    System.out.println(edades);

    System.out.println("Eliminando el primer dato de los ArrayList");
    //importante para eliminar, el primer dato siempre es indice 0 como un Array
    nombres.remove(1);//eliminamos el segundo dato o lo que se encuentre en la posicion "2" o indice 1
    System.out.println(nombres);

    //para limpiar todo el contenido del ArrayList
    nombres.clear();

    for (int i=0; i<50;i++ ) {
      nombres.add("No: "+String.valueOf(i));
    }
    System.out.println(nombres);


  }
}
