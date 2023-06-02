/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author abdulrehman
 */
public class Junit {
    public static void main(String[] args) {
                
        System.out.println("\nNode");
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        
        System.out.println("\nResistor");

        Resistor resistor1 = new Resistor(1.0, A, B);
        Resistor resistor2 = new Resistor(2.0, B, C);
        System.out.println(resistor1.toString());
        System.out.println(resistor2.toString());
    }
  /*private int a1,a2;
    
    public static void main (String[] args)
    {
        
         Circuit cir = Circuit.getInstance();
         
         while (input.next()!= "end")
         {
             if(input.next() == "r" || input.next() == "R" )
             {
               // If the user wishes to input a resistor 
                 double resistance = input.nextDouble();
                
                 a1 = input.nextInt();
                 
                 
                 
                 Resistor r1 = new Resistor();
                 
             }
                // If you want to input a voltage
             else if(input.next()== "v" || input.next()== "V")
             {
              
             }
             else if(input.next() == "spice")
             {
                 // If you want to display the entire circuit at output
             }
             else
             {
                 System.out.println("Error in input, not valid");
             }
         }
         
         
    }
    
}
*/
}
