
package EstructuraDeDatosAPP_SaulVega;

public class ejercicio9 {
    
public static void main(String[] args) {
int base = 10; //creamos una variable de tipo entero 
int exponente = -2;
System.out.println(potencia(base, exponente)); //imprimimos las variables
}
public static double potencia(int base, int exponente) {
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}
}
}

