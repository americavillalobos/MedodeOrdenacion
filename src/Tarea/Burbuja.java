/*************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez*
 * Fecha de creacion:18/03/2023                  *
 * Fecha de modificacion:18/03/2023              *
 * Descrpcion:Este programa tiene el metodo      *
 *              de seleccion burbuja             *
 *************************************************/
package Tarea;

public class Burbuja {
	
	public static void main(String[] args) {
	    
	    // Creamos un arreglo de numeros enteros  para ordenar
	    int[] arreglo = { 3, 2, 1, 4, 5 };
	    
	    // Mostramos el arreglo antes de ser ordenado
	    System.out.println("Arreglo sin ordenar:");
	    for (int i = 0; i < arreglo.length; i++) {
	      System.out.print(arreglo[i] + " ");
	    }
	    System.out.println();// este es un salto de linea 
	    
	    // Ordenamos el arreglo utilizando el método de burbuja
	    burbuja(arreglo);
	    
	    // Mostramos el arreglo ordenado
	    System.out.println("Arreglo ordenado:");
	    for (int i = 0; i < arreglo.length; i++) {
	      System.out.print(arreglo[i] + " ");
	    }
	    System.out.println();
	  }
	  
	  public static void burbuja(int[] arreglo) {
	    int n = arreglo.length;
	    int aux = 0; // el temp es el aux
	    for (int i = 0; i < n; i++) {
	      for (int j = 1; j < (n - i); j++) {
	        if (arreglo[j - 1] > arreglo[j]) {
	          // intercambiamos los elementos
	          aux = arreglo[j - 1];
	          arreglo[j - 1] = arreglo[j];
	          arreglo[j] = aux;
	        }
	      }
	    }
	  }

}
