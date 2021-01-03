/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import wargamers.Kings; 
import wargamers.RandomGenerator;
import wargamers.Selector; 
/**
 *
 * @author sebas
 */
public class WarGamers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minCubeValue = 1; 
        int maxCubeValue = 6; 
        int randomResult = wargamers.RandomGenerator.generateRandom(minCubeValue, maxCubeValue);
        System.out.println(randomResult);
        
        
        Kings Arthur = new Kings();
        Arthur.name = "King Arthur";
        Arthur.warriors = 1000;
        Arthur.strength = 10;  
        Arthur.weapon_strength = 15; 
        Arthur.armor_strength = 5; 
        
        Kings Ludwig = new Kings (); 
        Ludwig.name = "King Ludwig";
        Ludwig.warriors = 1700;
        Ludwig.strength = 6; 
        Ludwig.weapon_strength = 16; 
        Ludwig.armor_strength = 3; 
        
        int damageStrength = 200; 
        
        
        do {
            System.out.println("KING ARTHUR´S VALUES: \n" + "Warriors: " + Arthur.warriors);
            System.out.println("strength: "+Arthur.strength);
            System.out.println("weapon strength: "+Arthur.weapon_strength);
            System.out.println("armor strength: "+Arthur.armor_strength + "\n\n");
            
            System.out.println("KING LUDWIG ´S VALUES: \n" + "Warriors: " + Ludwig.warriors);
            System.out.println("strength: "+Ludwig.strength);
            System.out.println("weapon strength: "+Ludwig.weapon_strength);
            System.out.println("armor strength: "+Ludwig.armor_strength + "\n\n");
            
            System.out.println("It´s your turn: \n\n\n\n");
            wargamers.Selector.selectInteraction(Arthur, Ludwig, damageStrength);
            System.out.println("\n\n\n Enemie´s turn: ");
            getRandomAttack(Ludwig, Arthur, damageStrength); 
            System.out.println("\n\n");
        }while (Arthur.warriors > 0 || Ludwig.warriors > 0); 
    }
    
   
        
    private static void getRandomAttack (Kings king1, Kings king2, int damageStrength){
        int randomPick= wargamers.RandomGenerator.generateRandom(1, 3);
        
        switch (randomPick){
        case 1: 
                wargamers.Attack.attack(king1, king2, damageStrength);  
            break;
        case 2: 
                wargamers.Attack.run_over_King(king1, king2);
            break; 
        case 3 : 
                wargamers.Attack.specialAttack(king1, king2);
            break; 
    }
    }
        
        
    
    
}
