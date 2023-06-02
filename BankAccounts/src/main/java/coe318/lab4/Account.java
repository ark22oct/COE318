/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author abdulrehman
 */
public class Account {
 private int number ; //Bank 
 private String name; //Name of account owner
 private double balance; //Initial balance in the bank account
 
 public Account(String name, int number, double initialBalance){
     this.name= name;
     this.number= number;
     balance= initialBalance;
     }

//gets account owners name
 public String getName(){ 
 return this.name;
     
 }
 
//gets the account number
  public int getNumber(){ 
 return this.number;
     
 }
 
//gets the account balance
   public double getBalance(){
 return this.balance;
     
 }

 public boolean deposit (double amount){
   if (amount >0) {
     this.balance= this.balance + amount;
     return true;
   }
   else {
      return false;
             }
 }
 public boolean withdraw(double amount)
 {
    if (amount >0 && (this.balance - amount)>=0)
    {
    this.balance= this.balance - amount;
    return true;   
    }
    else 
    {
        return false;
    }
 }
 @Override
 public String toString() {//DO NOT MODIFY
 return "(" + getName() + ", " + getNumber() + ", " +
 String.format("$%.2f", getBalance()) + ")";
 }

}
