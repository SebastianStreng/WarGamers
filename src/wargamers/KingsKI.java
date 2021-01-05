/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;

/**
 *
 * @author anton
 */
public class KingsKI extends Kings{
    KingsKI(String name, int warriors, double strength, double weapon_strength, double armor_strength){
        super(name, warriors, strength, weapon_strength, armor_strength);
    }
    
    @Override
       public void selectInteraction(Kings king2, int damageStrength) {

        int randomPick= wargamers.RandomGenerator.generateRandom(1, 3);
        
        switch (randomPick){
        case 1: 
                this.attack(king2, damageStrength);  
            break;
        case 2: 
                this.run_over_King(king2);
            break; 
        case 3 : 
                int spAtRandom = wargamers.RandomGenerator.generateRandom(1,2);
                if (spAtRandom == 1) this.a1.proceedAttack(this, king2, damageStrength);
                else this.a2.proceedAttack(this, king2, damageStrength);
                break;
        }
    }
    
}
