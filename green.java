/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi4;

/**
 *
 * @author Chahat
 */
class Green extends Thread{  
Table t;  
Green(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(60);  
}   
}
