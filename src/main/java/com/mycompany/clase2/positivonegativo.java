package com.mycompany.clase2;
import java.util.Scanner;
public class positivonegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        if (numero == 0) {
            System.out.println(numero + " el numero es neutro");
        } else if (numero > 0) {
            System.out.println(numero + " Es positivo");
        } else {
            System.out.println(numero + " Es Negativo");
        }
        if(numero%2==0){
            System.out.println(numero +" Es un numero par");
        } else {
            System.out.println(numero+ " Es un numero impar");
        }
    }
}
