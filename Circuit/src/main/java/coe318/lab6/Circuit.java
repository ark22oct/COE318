/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;
/**
 *
 * @author abdulrehman
 */
public class Circuit {
    
    ArrayList <Resistor> res;
    
    
private static Circuit instance = null;


public static Circuit getInstance() {
 if (instance == null) {
 instance = new Circuit();
 }
 return instance;
 }


private Circuit() { //Yes, the constructor is PRIVATE!
this.res = new ArrayList <Resistor>();
}


public void add(Resistor r){
        this.res.add(r);
    }
    
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i=0; i<this.res.size(); i++){
            circuit += this.res.get(i).toString() + "\n";
        }
        return(circuit);
    }
}
