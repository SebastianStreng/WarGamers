/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import java.util.Scanner;
import wargamers.Kings;

/**
 *
 * @author sebas
 */
public class Selector {
    
    public void selectInteraction(Kings king1, Kings king2, int damageStrength){
        
        System.out.println("Please select one of the following interactions: ");
        
        System.out.println("1. attack");
        System.out.println("2. defense");
        System.out.println("3. run over");
        System.out.println("4. Special attack");
        
        Scanner myScanner = new Scanner(System.in);
        int decision = myScanner.nextInt();
        
        switch (decision){
            case 1:
                wargamers.Kings.attack(king1, king2, damageStrength);
        }
        
    }
        
        
        
        
    }
    
}
