/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import wargamers.Kings; 
import wargamers.RandomGenerator;
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
        
        RandomGenerator rndGen = new RandomGenerator();
        
        Kings k1 = new Kings("King Luis XIV", rndGen);
        Kings k2 = new Kings("King Harald", rndGen);
        
        int cntr = 0;
         
        while (k1.isAlive() && k2.isAlive()){
            if ( (cntr % 2) == 0 )k1.attack(k2);
            else k2.attack(k1);
            System.out.println(k1.toString());
            System.out.println(k2.toString());
            cntr++;
        }
        
/*        int minCubeValue = 1; 
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
        
        wargamers.Kings.attack(Arthur, Ludwig, damageStrength);*/
        
    }
    
   
        

        
        
    
    
}
