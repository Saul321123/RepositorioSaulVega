
package EstructuraDeDatosAPP_SaulVega;

public class ejercicio10 {
   
public static void main(String[] args) {
int numero = 123; //Guardamos los datos en una variable
System.out.println(sumaDigitos(numero));
}
public static int sumaDigitos(int numero){ //Creamos una clase que va a ser donde haremos nuestras condiciones
if(numero < 10){ //caso base
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //Cojo el digito y llamo a la funcion
}
}
} 

