/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author abdulrehman
 */
public class test {
    public static void main(String[] args) {
        
        Circuit cir = Circuit.getInstance();
        
        System.out.println("\nNode");
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        
        System.out.println("\nResistor");

        Resistor res1 = new Resistor(20.0, A, B);
        Resistor res2 = new Resistor(40.0, B, C);
        System.out.println(res1.toString());
        System.out.println(res2.toString());
        
        System.out.println("\nCircuit");
        
        cir.add(res1);
        cir.add(res2);
        System.out.println(cir.toString());
    }
    
}
