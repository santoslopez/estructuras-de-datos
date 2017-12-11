import java.util.*;

public class Pilas{
  /*
  pop para quitar el ultimo dato en la pila, solo se puede quitar el ultimo dato
  push introducimos un dato en la pila
  peek se utiliza para ver el ultimo dato en la pila
  empty utilizado para ver si la pila esta vacia
  */


  public static void main(String[] args) {
    //filo first-in, last-out, primero que entra ultimo que sale
    Stack pila = new Stack();
    pila.push("Kristina Basham");//primero que entra, obtiene indice 0
    pila.push(1000);//segundo que entra, obtiene indice 1
    pila.push("David J Malan");//indice 2
    pila.push("Brian Yu");//indice 3
    pila.push("Santos Lopez");//indice 4 - ultimo elemento

    //solo podemos obtener el ultimo dato en el Stack
    System.out.println("El ultimo elemento en el Stack es: "+pila.peek());

    //mientras que la pila no este vacia mostramos los datos
    while (pila.empty()==false) {
      System.out.println(pila.pop());
    }

  }
}
