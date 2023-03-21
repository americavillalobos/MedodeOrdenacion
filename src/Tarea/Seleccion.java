/*************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez*
 * Fecha de creacion:18/03/2023                  *
 * Fecha de modificacion:18/03/2023              *
 * Descrpcion:Este programa tiene el metodo      *
 *              ordenacion  seleccion            *
 *************************************************/
package Tarea;

public class Seleccion {
	
	    public static void main(String[] args) {
	        int[] arreglo = {5, 2, 9, 3, 7, 1, 8, 6, 4};

	        System.out.println("Array original: ");
	        for (int i = 0; i < arreglo.length; i++) {
			      System.out.print(arreglo[i] + " ");
			    }
			    System.out.println();// este es un salto de linea 
			    

	        ordenamientoSeleccion(arreglo);

	        System.out.println("Array ordenado: ");
	        for (int i = 0; i < arreglo.length; i++) {
			      System.out.print(arreglo[i] + " ");
			    }
			    System.out.println();
			  
	    }

	    public static void ordenamientoSeleccion(int[] arreglo) {
	        int n = arreglo.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < n; j++) {
	                if (arreglo[j] < arreglo[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arreglo[minIndex];
	            arreglo[minIndex] = arreglo[i];
	            arreglo[i] = temp;
	        }
	    }
	}


