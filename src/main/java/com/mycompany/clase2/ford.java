package com.mycompany.clase2;
public class ford {
public static void main (String [] args)    {
    int numero =0;
    for (numero =-5; numero <=10;numero++) {
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
}