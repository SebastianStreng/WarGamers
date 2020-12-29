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
        
        double k1_attack_skill =   king1.strength/king1.warriors; 
        double k2_attack_skill =   king2.strength/king2.warriors; 
        
        double sumKing1 =
                k1_attack_skill +
                king1.weapon_strength + 
                king1.armor_strength;
        
        double sumKing2 = 
                k2_attack_skill +
                king2.weapon_strength +
                king2.armor_strength;
        
        double amountDifference = Math.abs(sumKing1 - sumKing2);
        double warriorLoss = Math.round(amountDifference * damageStrength); //200
        
        System.out.println(sumKing1);
        System.out.println(k1_attack_skill); 
        
        if (sumKing1 > sumKing2){
            
            king2.warriors = king2.warriors - warriorLoss; 
            System.out.println(king2.name + " looses "+ warriorLoss + " warriors.");
            king1.strength = king1.strength * 0.9; 
            System.out.println(king1.strength);
        }
        else if (sumKing1 < sumKing2){
            
            king1.warriors = king1.warriors - warriorLoss; 
            System.out.println(king1.name + " looses "+ warriorLoss + " warriors.");
        }
        else if (sumKing1 == sumKing2){
            king2.warriors = king2.warriors - warriorLoss;
            king1.warriors = king1.warriors - warriorLoss;    
            System.out.println(king2.name + " looses "+ warriorLoss + " warriors.");
            System.out.println(king1.name + " looses "+ warriorLoss + " warriors.");
        }
        else {
           System.out.println("OOps - something went wrong here");
        }
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
