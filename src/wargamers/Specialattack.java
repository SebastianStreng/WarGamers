/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import wargamers.RandomGenerator;

/**
 *
 * @author sebas
 */
public class Specialattack {
    
    
    public void startSpecialAttack(Kings king1, Kings king2){
        int selector = wargamers.RandomGenerator.generateRandom(1, 4);
        
        switch (selector){
            case 1:
                environment(king1, king2);
                break; 
                
            case 2: 
                break; 
                
            case 3: 
                break; 
                
            case 4 : 
                break; 
        }
        
    }
    
    
    private void environment (Kings king1, Kings king2){
        
       int pickedSpecialAttack = wargamers.RandomGenerator.generateRandom(1, 3);
       
       switch(pickedSpecialAttack){
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
    
    private void snowfall (Kings king1, Kings king2){
        System.out.println("It starts to snow. The strength of all warriors is reduced by 10 percent. ");
        king1.strength = king1.strength * 0.9; 
        king2.strength = king2.strength * 0.9; 
    }
    
    private void earthquake(Kings king1, Kings king2){
        System.out.println("The earth is shaking. Each player loses 15 percent of the warriors");
        king1.warriors = king1.warriors * 0.85; 
        king2.warriors = king2.warriors * 0.85; 
    }
    
    private void sunrise (Kings king1, Kings king2){
        System.out.println("The sun is shining. The strength of warriors increases 10 percent");
        king1.strength = king1.strength * 1.1; 
        king2.strength = king2.strength * 1.1; 
    }
    
    private void bow_and_arrow_King1 (Kings king1, Kings king2){
        king2.armor_strength = king2.armor_strength * 0.9; 
        king2.warriors = king2.warriors * 0.85; 
        System.out.println(king1.name + "shoots arrows on " +  king2.name);
        System.out.println(king2.name + " looses 10 % armor strength and " + king2.warriors + " warriors");
    }
    
    private void bow_and_arrow_King2 (Kings king1, Kings king2){
        king1.armor_strength = king1.armor_strength * 0.9; 
        king1.warriors = king1.warriors * 0.85; 
        System.out.println(king2.name + "shoots arrows on " +  king1.name);
        System.out.println(king1.name + " looses 10 % armor strength and " + king1.warriors + " warriors");
    }
    
    
    private void rain_of_fire_King1(Kings king1, Kings king2){
        king2.armor_strength = king2.armor_strength * 0.7; 
        king2.warriors = king2.warriors * 0.75; 
        System.out.println(king1.name + "shoots burning arrows on " +  king2.name);
        System.out.println(king2.name + " looses 30 % armor strength and " + king2.warriors + " warriors");
    }
    
    private void rain_of_fire_King2(Kings king1, Kings king2){
        king1.armor_strength = king1.armor_strength * 0.7; 
        king1.warriors = king1.warriors * 0.75; 
        System.out.println(king2.name + "shoots burning arrows on " +  king1.name);
        System.out.println(king1.name + " looses 30 % armor strength and " + king1.warriors + " warriors");
    }
    
    private void smoke_bomb(Kings king1, Kings king2){
        
    }
    
    private void additional_warriors(Kings king1, Kings king2){
        
    }
    
    private void ambush(Kings king1, Kings king2){
        
    }
    
    private void health_package(Kings king1, Kings king2){
        
    }
    
    private void nothing_happens(Kings king1, Kings king2){
        
    }
    
}
