/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi4;

/**
 *
 * @author Gagandeep
 */
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=n;i++){  
     System.out.println(i);  
     try{  
      Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   }  
 }  
}
