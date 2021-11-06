package com.mycompany.clase2;
import javax.swing.JOptionPane;
public class entrada {
    public static void main(String[] args) {
    int num1,num2,suma;
    String nombre;
    double promedio;
    char letra;
       num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor ")); 
       num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero")); 
       nombre=JOptionPane.showInputDialog("Digite el nombre que desea"); 
       promedio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio"));  
       letra=JOptionPane.showInputDialog("Digite la letra ").charAt(0);
       suma=num1+num2; 
       JOptionPane.showMessageDialog(null,"La suma es  :"+suma); // imprime en ventana
       JOptionPane.showMessageDialog(null,"El nombre es "+nombre);
       JOptionPane.showMessageDialog(null, "El promedio es :"+promedio);
       JOptionPane.showMessageDialog(null,"La letra es :"+ letra);
       
        System.out.println("La suma es "+suma); // imprimir en consola  
        System.out.println("El nombre es "+nombre);
        System.out.println("El promedio es :"+promedio);
        System.out.println("La letra es :"+letra);
}
}