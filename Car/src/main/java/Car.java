/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdulrehman
 */
public class Car {
    
    /*String licencePlate;
    double speed;
    double maxSpeed;
    double fuel;
    
    public Car(String licencePlateVal, double speedVal, double maxSpeedVal, double fuelVal){
        licencePlateVal= licencePlate;
        speedVal= speed;
        maxSpeedVal= maxSpeed;
        fuelVal= fuel;    
    }
    
    public void accelerate(){ //set method being declared for acceleration with a constant
        speed= speed+10;
    }
    public void accelerate(double amount){ //set method being declared for acceleration with a variable, notice same name for set method, but parameter differnce
        speed= speed + amount;
    }
    
    public void setFuel(double fuelVal){
    fuel= fuelVal;
}
    
    public void setreFuel(double amount){
        fuel= fuel + amount;
    }
    
    public void setdrive(double speed){
        fuel= fuel  - (0.5*speed);
    }
            
    public String getPlate(){
        return licencePlate;
    }
    public double getSpeed(){
        return speed;
    }
    public double  getMaxSpeed(){
        return maxSpeed;
    }
    public double getFuel(){
        return fuel;
    } */
    public double length;
    public double width;
    public double height;
    
    public Car(double cLength, double cWidth, double cHeight){
        length= cLength;
        width= cWidth;
        height= cHeight;
    }
    
    public Car(){
        length=10.0;
        width=10.0;
        height=10.0;
    }
    public double getVolume(){
        return (length * width * height);
    }
    
}
