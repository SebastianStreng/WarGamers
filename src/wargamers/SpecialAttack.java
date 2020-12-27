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
public class SpecialAttack {
    public void startSpecialAttack(Kings king1, Kings king2){
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
    
    
    private void environment(Kings king1, Kings king2){
        
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
    
    private void distance_move(Kings king1, Kings king2){
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
    
    
    private void help(Kings king1, Kings king2){
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
    
    private void snowfall(Kings king1, Kings king2){
        System.out.println("It starts to snow. The strength of all warriors is reduced by 10 percent. ");
        king1.strength = king1.strength * 0.9; 
        king2.strength = king2.strength * 0.9; 
    }
    
    private void earthquake(Kings king1, Kings king2){
        System.out.println("The earth is shaking. Each player loses 15 percent of the warriors");
        king1.warriors = king1.warriors * 0.85; 
        king2.warriors = king2.warriors * 0.85; 
    }
    
    private void sunrise(Kings king1, Kings king2){
        System.out.println("The sun is shining. The strength of warriors increases 10 percent");
        king1.strength = king1.strength * 1.1; 
        king2.strength = king2.strength * 1.1; 
    }
    
    private void bow_and_arrow(Kings king1, Kings king2){
        king1.armor_strength = king1.armor_strength * 0.9; 
        king1.warriors = king1.warriors * 0.85; 
        System.out.println(king2.name + "shoots arrows on " +  king1.name);
        System.out.println(king1.name + " looses 10 % armor strength and " + king1.warriors + " warriors");
    }
    
    private void rain_of_fire(Kings king1, Kings king2){
        king1.armor_strength = king1.armor_strength * 0.7; 
        king1.warriors = king1.warriors * 0.75; 
        System.out.println(king2.name + "shoots burning arrows on " +  king1.name);
        System.out.println(king1.name + " looses 30 % armor strength and " + king1.warriors + " warriors");
    }
    
    private void smoke_bomb(Kings king1, Kings king2){
        king1.strength = king1.strength * 0.85; 
        king1.warriors = king1.warriors * 0.9; 
        System.out.println(king2.name +  " throws smokebombs on " + king1.name);
        System.out.println(king1.name +  " looses 15 % strength and " + king1.warriors + " warriors.");
    }
    
    private void additional_warriors(Kings king1, Kings king2){
        int added_warriors = wargamers.RandomGenerator.generateRandom(50, 400);
        king2.warriors = king2.warriors + added_warriors; 
        System.out.println(king2.name + " gets support by " + added_warriors +  " new warriors. ");
        System.out.println("The Army of " +  king2.name + " has now " +  king2.warriors +  " warriors.");
        System.out.println("The Army of " +  king1.name + " is afraid. ");    
    }
    
    private void ambush(Kings king1, Kings king2){
        int warriorloss = wargamers.RandomGenerator.generateRandom(150, 300);
        king1.warriors = king1.warriors - warriorloss; 
        System.out.println(king2.name + " has started an ambush.");
        System.out.println(king1.name + "looses" + warriorloss + " warriors.");
        System.out.println(king1.name + " has " + king2.warriors + " left.");  
    }
    
    private void health_and_care_package(Kings king2){
        System.out.println(king2.name + "´s armee gets +2 strength, +2 armor strength, +2 weapon strength. ");
        king2.strength = king2.strength + 2; 
        king2.armor_strength = king2.armor_strength + 2; 
        king2.weapon_strength = king2.weapon_strength + 2; 
    }
    
}
