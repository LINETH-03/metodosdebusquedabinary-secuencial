package com.company;

import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class Main {

    public static void main(String[] args) {
	 Busquedabinaria();
	 //Busquedasecuencial();


    }

    public static void Busquedabinaria(){
        System.out.println("       BUSQUEDA BINARIA"+"\n"+"-------------------------------");
        int[] numbers={24,90,15,30,3,45,80,88};
        System.out.println("ARRAY: "+"\n"+Arrays.toString(numbers)+"\n");
        int Search = 486;
        Arrays.sort(numbers);
        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(numbers)+"\n");
        if ( binarySearch(numbers, Search)!= -1)
            System.out.println("¬El número " + Search + " está en el Array¬");
        else
            System.out.println("El número " + Search + " NO está en el Array");

    }
    public static void Busquedasecuencial(){
        System.out.println("  BUSQUEDA SECUENCIAL O LINEAL"+"\n"+"--------------------------------");
        int[] numbers={5,250,175,30,4,21,12,33};
        System.out.println("ARRAY: "+"\n"+Arrays.toString(numbers)+"\n");
        int Search = 5;
        Arrays.sort(numbers);
        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(numbers)+"\n");
        if ( secuencialsearch(numbers, Search)!= -1)
            System.out.println("¬El número " + Search + " está en el Array¬");
        else
            System.out.println("El número " + Search + " NO está en el Array");

    }


    public static int binarySearch(int[] arraybinario, int numSearch) {
        int start = 0;
        int size = arraybinario.length - 1;
        int pos;
        while (start <= size) {
            pos = (start+size) / 2;
            if ( arraybinario[pos] == numSearch )
                return pos;
            else if ( arraybinario[pos] < numSearch ) {
                start = pos+1;
            } else {
                size = pos-1;
            }
        }
        return -1;
    }
   public static int secuencialsearch(int[] arraysecuencial, int numSearchsec) {
       int posicion = -1;
       for(int i = 0; i < arraysecuencial.length; i++){
           if(arraysecuencial[i] == numSearchsec){
               posicion = i;
               break;
           }
       }
       return posicion;

    }
        //int size = arraynumbers.length;
        // int middle = size/2;
        // System.out.println("Size: " + size);
        // System.out.println("Middle: " + middle);
        // System.out.println("Array: " + Arrays.toString(arraynumbers));
        //
        // if (arraynumbers[middle] == numSearch)
        //     return arraynumbers[middle];
        // else if (size == 1)
        //     return arraynumbers[middle]-1;
        // else if (arraynumbers[middle] > numSearch)
        //     binarySearch(Arrays.copyOfRange(arraynumbers,0,middle),numSearch);

        // else {
        //      binarySearch(Arrays.copyOfRange(arraynumbers,middle+1,size),numSearch);
        // }

        // return size;


}
