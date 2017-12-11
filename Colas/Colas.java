import java.util.LinkedList;

/*
Las colas son lo contrario a las Pilas
Se introduce los datos ordenadamente y se obtiene el primer dato que ingresamos

*/
public class Colas{


  public static void main(String[] args) {
    //FIFO first.in, first out
    LinkedList cola = new LinkedList();
    for (int i=1;i<11 ;i++ )
      cola.offer(i);//estamos agregando datos, lo agrega ordenadamente
      //lo agrega de forma descendente -> el metodo push creo que no es propio de las Colas
      //cola.push(i);

    //mientras tengamos datos los mostramos
    while (cola.peek()!=null) {
      System.out.println(cola.poll());
    }
  }
  
}
