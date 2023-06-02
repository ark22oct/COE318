/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdulrehman
 */
public class Airport {
// Class fields (instance variables) and methods
int [] gates; //the data for gate numbers in i needs to be stored somewhere, so we store it in an array

Airport(int numGates){ //Need a constructor with a single variable as we see new Airport(5) within the main function.
    
    gates= new int[numGates];// initialze the array declared and this tells us the number of passengers at each gate.
    
}

public void addPassengers(int gateNum, int numPassengers){ //Need a addPassengers method that contains two parameters
                                                          // One for the gate number and the other for the number of passengers as seen in the main function.
    gates[gateNum]=numPassengers;
}

public void printPassengers(){ // the print statement is not a part of the loop in the main, so to print it out multiple times, we need another for loop for this method!
    for (int i=0; i<gates.length; i++){
    System.out.println("Number of passengers at Gate " + (i+1) + " is " + gates[i]);
}
}
    
    

public static void main(String[] args) {
Airport quizairport = new Airport(5); // creating object with constructor Airport(no. of gates)
for (int i=0; i<5; i++)
    quizairport.addPassengers(i,(20*i+3)); // addPassengers
//(gate no., no. of passengers at the gate) to add no. of passengers to a gate
quizairport.printPassengers(); // print gate number and no. of
// passengers at the gate
}}
/*The output of the program is:
Number of passengers at Gate 1 is 3
Number of passengers at Gate 2 is 23
Number of passengers at Gate 3 is 43
Number of passengers at Gate 4 is 63
Number of passengers at Gate 5 is 83*/
