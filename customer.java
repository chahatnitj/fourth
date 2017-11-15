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
class Customer{  
    int amount=10000;  
      
    synchronized void withdraw(int amount){  
    System.out.println("Bob going to withdraw...");  
      
    if(this.amount<amount){  
    System.out.println("Less balance; waiting for deposit...");  
    try{wait();}catch(Exception e){}  
    }  
    this.amount-=amount;  
    System.out.println("Bob withdraw completed...");  
    }  
      
    synchronized void deposit(int amount){  
    System.out.println("Alice going to deposit...");  
    this.amount+=amount;  
    System.out.println("Alice deposit completed... ");  
    notify();  
    }  
    }  
