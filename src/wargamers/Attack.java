/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;

/**
 *
 * @author sebas
 */
public class Attack {
    
     public static void attack(Kings king1, Kings king2, int damageStrength){
         
         king2.warriors = king2.warriors * 0.7; 
         System.out.println(king1.name + " has attacked " + king2.name + "´s armee. " +
                 king2.name + " has now " + king2.warriors + " warriors left.");
    }
     
      public void retreat(){
        
    }
    
    
    public static void run_over_King(Kings king1, Kings king2){
        int run_over_indicator = wargamers.RandomGenerator.generateRandom(100, 250);
        king2.warriors = king2.warriors - run_over_indicator; 
        king1.warriors = king1.warriors + run_over_indicator; 
        System.out.println(run_over_indicator + " warriors leave " +  king2.name + "´s army and change sites."); 
    }
    
    public static void specialAttack (Kings king1, Kings king2){
        wargamers.SpecialAttack.startSpecialAttack(king1, king2);
        
    }
    
    
    public void recovery (){
        
    }
}
