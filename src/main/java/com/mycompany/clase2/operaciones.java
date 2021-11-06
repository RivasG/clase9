
package com.mycompany.clase2;

import java.util.Scanner;

public class operaciones {
 public static void main(String [] args )  {
     Scanner entrada=new Scanner(System.in);
     double num;
     
     System.out.println("Digite un numero"); 
     num=entrada.nextDouble();
     
     System.out.println("El cuadrado es :"+Math.pow(num,2)); // cuadrado
     System.out.println("El cubi es :"+Math.pow(num, 3)); // cubo
     
     System.out.println("La raiz cuadrada es :"+Math.sqrt(num)); // raiz cuadrada
     
     System.out.println("La raiz cubica es :"+Math.cbrt(num)); // raiz cubica
     
 } 
}
