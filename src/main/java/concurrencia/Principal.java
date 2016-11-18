/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class Principal implements Runnable{
    
    public static void main(String[] args) {
        /*
       Segunda forma de implementar threads implementando la interface Runnable 
        
        Usando poloimorfismo
        
        */
     Runnable r=new Principal();
     Thread t1= new Thread(r);
     t1.setName("Ludwig");
     Thread t2= new Thread(r);
     t2.setName("Bren");       
     //t1.start();
        //t2.start();
        //La tercera forma que viene  en el examen Usando clases internas anonimas
        Thread t3 = new Thread(new Runnable() {
         @Override
         public void run() {
             System.out.println("Soy un background thread");
         }
            
        });
    }

    @Override
    public void run() {
  /*if(Thread.currentThread().getName().equals("Ludwig")){
      System.out.println("Soy Hombre");
  }else{
      System.out.println("Soy mujer");
  }*/
  
    }
}
