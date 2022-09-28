
package EstructuraDeDatosAPP_SaulVega;

public class ejercicio4 {
    
public static void main(String[] args) {
int[] array={1,2,3,4,5}; //Creamos un arreglo con 6 indices, empezando del indice 0 posicion 0,
int elementoBuscar=3; //Creamos una variable de tipo entero que va a tener un valor de 3
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0); //
System.out.println(posElementoEncontrado); //imprimimos la variable posElementoEncontrado.
}

//creamos una clase estatica donde podremos imprimir nuestros valores 
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){ //creamos un int que va a ser donde guardaremos nuestros 
    //valores del arreglo
    
    
    //
if(indice==array.length || array[indice]==elementoBuscar){ //declaramos la condicion si la variable indice va a ser igual a nuestro arreglo y mandamos a imprimir con .length
if(indice==array.length){ //hace la comparacion con el if y nos regtresa los valores con return
return -1;
}else{
return indice; //retornamos los valores
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1); //en esta parte retornamos los valores del arreglo
}
}
}

