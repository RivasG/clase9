
package com.mycompany.clase2;

import java.util.Scanner;

public class tarea {
           public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char operador;
        float valor1, valor2, resultado;
        System.out.println("Ingresar primer numero: ");
        valor1= entrada.nextFloat();
        System.out.println("Ingresar segundo numero: ");
        valor2 = entrada.nextFloat();
        System.out.println("Ingresar operador(-,+,*,/): ");
        operador = entrada.next().charAt(0);
        switch (operador) {
            case '-':
                resultado = valor1 - valor2;
                System.out.println("La resta es:" + resultado);
                break;
            case '+':
                resultado = valor1+ valor2;
                System.out.println("La suma es:" + resultado);
                break;
            case '*':
                resultado = valor1* valor2;
                System.out.println("La multiplicación es" + resultado);
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1/ valor2;
                    System.out.println("La división es :" + resultado);
                } else {
                    System.out.println("no se puede dividir entre cero");
                }
                break;
            default:
                System.out.println("resultado no valido");
        }
    }

}
