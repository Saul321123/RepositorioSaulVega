
package EstructuraDeDatosAPP_SaulVega;


public class ejercicio8 {
    
public static void main(String[] args) {
String palabra = "Hola";
System.out.println(invertirPalabra(palabra, palabra.length()-1));
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){ //comparamos los valores
return palabra.charAt(longitud)+""; //regresamo los valores y concatenamos
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1)); //retornamos los valores y concatenamos
}
}
}

