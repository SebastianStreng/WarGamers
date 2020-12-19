/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import java.lang.Math;


/**
 *
 * @author sebas
 */
public class Kings {
    
    double warriors; 
    double strength; 
    double weapon_strength;
    double armor_strength; 
    String name; 
    
    double attack_skill = strength/warriors; 
    
    
    
    public static void attack(Kings king1, Kings king2, int damageStrength){
        
        double sumKing1 =
                king1.attack_skill +
                king1.weapon_strength + 
                king1.armor_strength;
        
        double sumKing2 = 
                king2.attack_skill +
                king2.weapon_strength +
                king2.armor_strength;
        
        
        double amountDifference = Math.abs(sumKing1 - sumKing2);
        double warriorLoss = amountDifference * damageStrength; //200
        
        System.out.println(sumKing1);
        System.out.println(king1.attack_skill); //geht nicht weil kleiner durch größer geteilt wird
        
        
        
        if (sumKing1 > sumKing2){
            
            king2.warriors = king2.warriors - warriorLoss; 
            System.out.println(king2.name + " looses "+ warriorLoss + "warriors.");
        }
        else if (sumKing1 < sumKing2){
            
            king1.warriors = king1.warriors - warriorLoss; 
            System.out.println(king1.name + " looses "+ warriorLoss + "warriors.");
        }
        else if (sumKing1 == sumKing2){
            king2.warriors = king2.warriors - warriorLoss;
            king1.warriors = king1.warriors - warriorLoss;    
            System.out.println(king2.name + " looses "+ warriorLoss + "warriors.");
            System.out.println(king1.name + " looses "+ warriorLoss + "warriors.");
        }
        else {
           System.out.println("OOps - something went wrong here");
        }
        
        
    }
    
    
    
    public void defense(){
        
    }
    
    
    
    public void retreat(){
        
    }
    
    
    
    public void run_over(){
        
    }
    
    
    
    public void specialAttack (){
        
    }
    
    
    
}
