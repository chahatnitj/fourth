package assi4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gagandeep
 */
class Yellow extends Thread{  
Table t;  
Yellow(Table t){  
this.t=t;  
}  
public void run(){   
t.printTable(50);  
}   
} 
