
package com.mycompany.clase2;
/* comision=salariobase*16%
   bonificacion=salariobase*9%
  seguro=salariobruto*13;
*/
import java.util.Scanner;

public class planilla {
public static void main(String [] args)  {
    Scanner entrada=new Scanner (System.in);
    String nombre;
    double salariobase,bonificacion,comision,salariobruto,seguro,salarioneto;
    System.out.println("Ingrese el nombre del empleado");
    nombre=entrada.nextLine();
    
    System.out.println("Ingrese el salario base");
    salariobase=entrada.nextDouble();
    
    comision=salariobase*0.16;
    bonificacion=salariobase*0.09;
    
    salariobruto=salariobase+comision+bonificacion;
    
    seguro=salariobruto*0.13;
    salarioneto=salariobruto-seguro;
   
    System.out.println(nombre+" :Tiene un salario bruto de :"+salariobruto+"\n con un salario neto de :"+salarioneto);
    
    // si salarioneto mayor a 500000 colaborador destacado sino trabaje un poco mas
    if(salarioneto>=500000){
        System.out.println(nombre+" Es un Colaborador destacado");
    }else {
        System.out.println(nombre+" Trabaje un poco mas ");
    }
}  
}
