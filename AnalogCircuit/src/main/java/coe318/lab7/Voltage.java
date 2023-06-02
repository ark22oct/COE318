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
public class Voltage {
    private double voltage;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter =1;
    
    public Voltage (double voltage, Node node1, Node node2)
    {
        //If statement is being used to check the polarity of the voltage entered
        //This applies to a voltage that obeys the sign convention and has a voltage value
        if((node1.id > node2.id && voltage > 0) || (node1.id < node2.id && voltage <0)){
            this.node1 = node1; //instiantiating nodes and voltage
            this.node2 = node2;
            this.voltage = voltage;
            this.id = counter;
            counter ++; 
        }
        else
        {
        throw new IllegalArgumentException("Polarity of voltage source is incorrect");               
        }
        }
    
     public Node[] getNodes()
    {
       Node[] nodes = new Node[2]; //Storing nodes 1 and 2 into node array elements 0 and 1
       nodes[0] = this.node1;
       nodes[1] = this.node2;
       return nodes;
    }
     @Override
     public String toString()
    {
       
        if (this.node1.id < this.node2.id)
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + "-" + this.voltage +".";
        else
            return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + this.voltage +".";
    } 
    
}
