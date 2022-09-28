
package EstructuraDeDatosAPP_SaulVega;


public class ejercicio3 {
    
 //Creamos una clase estatica vacia
public static void main(String[] args) {
int[] array={1,2,3,4,5}; //Creamos un arreglo del 1 al 5, pero iniciamos en un indice 0 que a su vez se ira incrementando.
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza, en indice 0
}
public static void mostrarArrayRecursivo(int[] array, int indice){
/*1º forma*/
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/
/*2º forma*/
if (indice != array.length){
//Mostramos el valor en ese indice
System.out.println(array[indice]);
//Llamamos recursivamente a la función
mostrarArrayRecursivo(array, indice+1);
}
}
}

