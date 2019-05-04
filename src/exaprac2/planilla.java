/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author David Cordova
 */
public class planilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cant= 0;
       double mayor=0;
       String detalle="Detalle de planilla \n\n";
       double total=0;
       cant=Integer.parseInt(JOptionPane.showInputDialog("N° de empleados a registrar en planilla"));
       
       String nombre[]= new String[cant];
       int hrs[]= new int[cant];
       double sxh[]= new double[cant];
       double salario[]= new double [cant];
       
       for(int i=0; i<cant; i++){
           nombre[i]=JOptionPane.showInputDialog("Nombre del empleado"+(i+1));
           hrs[i]=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas trabajadas"));
           sxh[i]=Double.parseDouble(JOptionPane.showInputDialog("Salario por horas"));
           salario[i]=hrs[i]*sxh[i];
           detalle += "Empleado: "+ nombre[i] + "\n" + "Horas trabajadas: "+ hrs[i] + "\n" + "Salario por horas: "+ sxh[i] + "\n" + "Salario a pagar: " + salario[i] + "\n\n";
           total+=salario[i];        
       }
       JOptionPane.showMessageDialog(null, detalle + "\n\n"+ "Total de planilla: "+total);
       
          mayor=salario[0];
          
       for (int c=0; c<cant; c++){
           if (salario[c]>mayor){
               mayor=salario[c];
               JOptionPane.showMessageDialog(null,"El empleado con el salario mayor es: "+nombre[c]+"\ncon un salario de: "+mayor);
           }
       }
    }
    
}
