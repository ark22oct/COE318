/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdulrehman
 */
public class Employee {
    public String employeeName; //Name of the employee
    Employee Supervisor; //object of type "Employee" being declared
    
    public Employee(String employeeName,Employee Supervisor){
        this.employeeName= employeeName;
        this.Supervisor= Supervisor; //initiallizing object "Employee" to = Supervisor
    }
    
}
