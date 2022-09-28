
package EstructuraDeDatosAPP_SaulVega;


public class ejercicio2 {
       public static void main(String[] args) {

        

        int n=5;

        //Guarda el resultado en una variable

        int resultado=factorialRecursivo(n);

        

        //Muestra el resultado

        System.out.println(resultado);

        

    }

    

    public static int factorialRecursivo(int numero){

        

        int res; //creamos una variable res, donde se gusrdaran los resultados de nuestra operacion

        

        if(numero==1){

            //Se termina la recursión

            return 1;

        }else{

            //Se llama asi misma la funcion, con el valor del numero menos 1

            res = numero * factorialRecursivo(numero-1);

        }

        

        //Devolvemos el valor

        return res;

        

    }

    

}

