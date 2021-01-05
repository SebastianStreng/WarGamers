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
        
        
        Kings Arthur = new Kings("King Arthur", 1000, 10, 15, 5);
        
        KingsKI Ludwig = new KingsKI ("King Ludwig", 1700, 6, 16,3); 
        int damageStrength = 200; 
        
        
        do {
            System.out.println(Arthur.toString());
            System.out.println(Ludwig.toString());

            System.out.println("It´s "+Arthur.getName()+" turn:");
            Arthur.selectInteraction(Ludwig, damageStrength);
            System.out.println("\nIt´s "+Ludwig.getName()+" turn:");
            //getRandomAttack(Ludwig, Arthur, damageStrength); 
            Ludwig.selectInteraction(Arthur, damageStrength);
            System.out.println("\n\n");
        }while (Arthur.getWarriors() > 0 && Ludwig.getWarriors() > 0); 

        if (Arthur.getWarriors() <= 0) System.out.println(Ludwig.getName()+" has won!");
        else System.out.println(Arthur.getName()+" has won!");
        
        System.out.println(Arthur.toString());
        System.out.println(Ludwig.toString());
        
    }
    
        /*
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
    }*/
        
        
    
    
}
