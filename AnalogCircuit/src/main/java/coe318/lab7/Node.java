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
public class Node {
    
 public int id; //current nodes ID number
    public static int idNext=0; // Next nodes ID number
    
    public Node()
    {
        this.id= idNext;
        idNext++;     
    }
    @Override
    public String toString(){
        return " " + this.id;
    }
    
}
