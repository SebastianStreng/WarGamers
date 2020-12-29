/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import java.util.Scanner;
import wargamers.Attack; 

/**
 *
 * @author sebas
 */
public class Selector {
    
<<<<<<< Updated upstream
    public void selectInteraction(){
=======
    public static void selectInteraction(Kings king1, Kings king2, int damageStrength){
>>>>>>> Stashed changes
        
        System.out.println("Please select one of the following interations: ");
        
        System.out.println("1. attack");
<<<<<<< Updated upstream
        System.out.println("2. defense");
=======
        System.out.println("2. run over");
        System.out.println("3. speacial Attack");
        
>>>>>>> Stashed changes
        
        Scanner myScanner = new Scanner(System.in);
        int decision = myScanner.nextInt();
        
<<<<<<< Updated upstream
        
        
        
        
        switch (decision){
        //case 1: Kings.attack(king1, king2, decision);
    }
        
        
        
=======
        switch (decision){
            case 1: 
                wargamers.Attack.attack(king1, king2, damageStrength);  
            break;
            case 2: 
                wargamers.Attack.run_over_King(king1, king2);
            break; 
            case 3 : 
                wargamers.Attack.specialAttack(king1, king2);
                break; 
            default: 
                System.out.println("please type the right number of your prefered attack. ");
            break; 
        }

    } 
>>>>>>> Stashed changes
        
    }
    

