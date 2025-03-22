package org.entrg6;
import java.math.BigDecimal;
import java.util.*;


import excepciones.*;

public class App
{

/*
    APARTADO 8

    Ejercicio 31

    A continuación, el código mínimo para que el método pase el primer test:

    public static int sumaNEnteros(int n){
        return 1;
    }


    A continuación, el código para pasar el segundo test:
 */
    public static int sumaNEnteros(int n) throws NumeroNegativoException {
        try {
            if (n > 0) {
                int suma = 0;
                for (int i = 0; i <= n; i++) {
                    suma += i;
                }
                return suma;
            } else {
                throw new NumeroNegativoException();
            }
        } catch (NumeroNegativoException e){
            System.out.println("Recuerde que la suma solo puede darse para los n primeros enteros POSITIVOS");
            return -1;
        }
    }

    /*
    Ejercicio 33
     */



/*
  APARTADO 10

  Ejercicio 58
 */


    //Después de ver fallar el test, escribimos la implementación de los métodos
    //necesarios.

    public static double factorial(double n){
        int factorial = 1;
        for (int k = 1; k<=n; k++) {
            factorial *= k;
        }
        return factorial;
    }

    public static double eXTaylorIterativo(int x, int n){
        double calculo = 0;
        for (double k=0; k<=n; k++){
            calculo+=Math.pow(x,k)/factorial(k);
        }
        return calculo;

    }

    public static double eXTaylorRecursivo(int x, int n){
        if (x==0){
            return 1.0;
        }
        if (n==0){
            return 1.0;
        }
        else {
            return eXTaylorRecursivo(x, n-1)+Math.pow(x, n)/factorial(n);
        }
    }

    /*
        La relación de la exactitud de la aproximación y el valor de n se encuentra en
        que, al ser n el número de sumandos, cuantos más haya más exacta va a ser la aproximación.
        Si lo comparamos con el método de los rectángulos para el cálculo de una integral,
        podemos decir que funciona como la base de cada rectángulo: cuando es más pequeña, hay mayor
        posibilidad de rectángulos con alturas más parecidas a los valores y de f(x)=y, de tal forma que
        el resultado es más exacto a la hora de hacer el sumatorio. De igual manera funciona la n.
     */

    /*
    Ejercicio 59: NO LO COMPLETAMOS HASTA HABER TRABAJADO ESTRUCTURAS DE DATOS
     */

    static public BigDecimal sumaIterativaElementosPila(Stack pila)
    {
        BigDecimal suma = BigDecimal.ZERO;
        while(!pila.empty())
        {
            //pila.peek() devuelve la cima de la pila.
            suma = suma.add((BigDecimal) pila.peek());
            pila.pop();
        }
        return suma;
    }

    /*
    APARTADO 11

    Ejercicio 60
     */
    public static double mediaArmonica(List<Double> datos) throws ListaVaciaException, ListaConCeroException, SumaInversosEsCeroException {
        try {
            if (datos.size()==0){
                throw new ListaVaciaException(datos);
            }
            for (int i = 0; i < datos.size(); i++){
                if (datos.get(i)==0){
                    throw new ListaConCeroException(datos);
                }
            }
            double sumaInversos = 0;
            for (int i = 0; i < datos.size(); i++){
                sumaInversos+=datos.get(i);
            }
            if (sumaInversos==0){
                throw new SumaInversosEsCeroException(datos);
            }

            int n = datos.size();
            double sumatorioDenominador = datos.stream().mapToDouble(num -> 1.0/num).reduce((num1,num2)->num1+num2).orElse(1.0);
            return n / sumatorioDenominador;

        } catch(ListaVaciaException e){
            System.out.println("La lista dada es vacia. El programa necesita una lista con elementos distintos de 0.");
        } catch(ListaConCeroException e){
            System.out.println("La lista dada tiene un elemento que es 0. No se permite que las listas tengan 0. Vuelva a intentarlo.");
        } catch(SumaInversosEsCeroException e){
            System.out.println("La suma de los inversos de la lista es 0. No se permite esto en el programa. Vuelva a intentarlo.");
    }
        //Escogemos 0.0 de retorno porque es un valor que nunca podría dar la función con unos parámetros correctos;
        //así, en los tests hacemos que reconozca este valor a la hora de fallar.
        return 0.0;

        /*
        Calcular la complejidad asintótica temporal del algoritmo que se mues-
        tra a continuación. Su pseudocódigo sólo es válido para conjuntos de
        datos no vacíos que no contienen el cero ni valores pŕoximos a cero, y
        tal que la suma de sus inversos tampoco es cero.


        function MediaArmónica(datos)
        suma ← 0                     O(0)
        for dato in datos do         O(n)
        suma ← suma + 1/dato         O(1)
        end for
        return datos.length/suma     O(1)
        end function

        Resultado: O(n)

         */

}

}
