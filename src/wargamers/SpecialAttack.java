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
public interface SpecialAttack  {
    public abstract void proceedAttack(Kings king1, Kings king2, int damageStrength);
}


/*   public static void startSpecialAttack(Kings king1, Kings king2){
        int selector = wargamers.RandomGenerator.generateRandom(1, 4);
        
        switch (selector){
            case 1:
                environment(king1, king2);
                break; 
                
            case 2: 
                distance_move(king1, king2);
                break; 
                
            case 3: 
                help(king1, king2);
                break; 
                
            case 4 : 
                System.out.println("nothing happens");
                break; 
                
            default : 
                System.out.println("something went wrong.");
        }
        
    }
    
    
    private static void environment(Kings king1, Kings king2){
        
       int pickedSpecialAttackEnvironment = wargamers.RandomGenerator.generateRandom(1, 3);
       
       switch(pickedSpecialAttackEnvironment){
           case 1: 
               snowfall(king1, king2); 
               break; 
               
           case 2: 
               earthquake(king1, king2); 
               break; 
               
           case 3: 
               sunrise (king1, king2);
               break; 
       }
    }
    
    private static void distance_move(Kings king1, Kings king2){
         int pickedSpecialAttackDistance_move = wargamers.RandomGenerator.generateRandom(1, 3);
       
       switch(pickedSpecialAttackDistance_move){
           case 1: 
               bow_and_arrow(king1, king2); 
               break; 
               
           case 2: 
               rain_of_fire(king1, king2); 
               break; 

           case 3: 
               smoke_bomb(king1, king2);
               break; 
       } 
    }
    
    
    private static void help(Kings king1, Kings king2){
        int pickedSpecialAttackHelp = wargamers.RandomGenerator.generateRandom(1, 3);
       
       switch(pickedSpecialAttackHelp){
           case 1: 
               additional_warriors(king1, king2); 
               break; 
               
           case 2: 
               ambush(king1, king2); 
               break; 

           case 3: 
               health_and_care_package(king2);
               break; 
       } 
    }
    
    private static void snowfall(Kings king1, Kings king2){
        System.out.println("It starts to snow. The strength of all warriors is reduced by 10 percent. ");
        king1.strength = king1.strength * 0.9; 
        king2.strength = king2.strength * 0.9; 
    }
    
    private static void earthquake(Kings king1, Kings king2){
        System.out.println("The earth is shaking. Each player loses 15 percent of the warriors");
        king1.warriors = king1.warriors * 0.85; 
        king2.warriors = king2.warriors * 0.85; 
    }
    
    private static void sunrise(Kings king1, Kings king2){
        System.out.println("The sun is shining. The strength of warriors increases 10 percent");
        king1.strength = king1.strength * 1.1; 
        king2.strength = king2.strength * 1.1; 
    }
  
    
    private static void health_and_care_package(Kings king1){
        System.out.println(king1.name + "´s armee gets +2 strength, +2 armor strength, +2 weapon strength. ");
        king1.strength = king1.strength + 2; 
        king1.armor_strength = king1.armor_strength + 2; 
        king1.weapon_strength = king1.weapon_strength + 2; 
    }
    */
