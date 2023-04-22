
package estructuradatos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Estructuradatos {

  
    public static void main(String[] args) {
   /*  LinkedList<Integer> lista = new LinkedList<Integer>();
lista.add(10); //Agrega el entero 10 a la lista
lista.add(20); //Agrega el entero 10 a la lista
lista.add(30); //Agrega el entero 10 a la lista  
lista.addFirst(80); //Agrega el entero 10 a la lista
System.out.println(lista); //Muestra la lista
        for(int i : lista){
            //Muestra cada elemento de la lista usando for each 
            System.out.println(i);
            
                   
        }
lista.addFirst(5); //Agrega un entero en la primera posición
System.out.println(lista); //Muestra la lista
lista.add(3, 60); //Agrega en la posición 3 al entero 60
System.out.println(lista); //Muestra la lista
lista.remove(1); //Remueve el elemento de la posición 1
System.out.println(lista); //Muestra la lista
lista.remove(new Integer(20)); //Remueve el primer dato que tenga valor 20

System.out.println(lista); //Muestra la lista*/
   
   Stack pila = new Stack();
  
   Scanner leer=new Scanner(System.in);
   int num;
   String peto;
   pila.push("walter");
   pila.push(1);
   pila.push("carro");
   pila.push(20);
  /* for(int i=0;i<5;i++){
       Stack otroi =new Stack(); 
       pila.push(otroi.push(num=leer.nextInt()));
       otroi.push(peto=leer.next());
        System.out.println(otroi);
   }*/
   System.out.println(pila);
   for(Object n: pila){
       System.out.println("posicion:"+n);
  
   }
/*pila.push(otro.push(10)); //Agrega el entero 10 a la pila
otro.push(40);
pila.push(20); //Agrega el entero 20 a la pila
pila.push("pare"); //Agrega el entero 30 a la pila
System.out.println(pila); // Muestra la pila
System.out.println(pila.pop()); //Remueve la cima de la pila
System.out.println(pila); // Muestra la pila
System.out.println(otro);
boolean vacia = pila.isEmpty(); //Verifica si la pila
//está vacía
System.out.println("La pila está vacía? " + vacia);
pila.removeAllElements(); //Remueve todos los elementos
//de la pila
vacia = pila.isEmpty();
System.out.println("La pila está vacía? " + vacia);
  
 /* Queue<Integer> cola = new LinkedList<Integer>();
cola.add(10); //Agrega el número 10 a la cola
cola.add(20); //Agrega el número 20 a la cola
cola.add(30); //Agrega el número 30 a la cola
System.out.println(cola.peek()); //Trae la cabeza de la cola
//pero no la remueve
System.out.println(cola); //Imprime la cola
System.out.println(cola.remove()); //Remueve la cabeza de la
//cola
System.out.println(cola); //Imprime la cola
cola.add(40); // Agrega el número 40 a la cola
System.out.println(cola); //Imprime la cola*/
    }
    
}
