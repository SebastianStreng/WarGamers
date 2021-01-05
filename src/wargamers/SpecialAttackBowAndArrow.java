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
public class SpecialAttackBowAndArrow implements SpecialAttack{

    @Override
    public void proceedAttack(Kings king1, Kings king2, int damageStrength) {
        king2.setArmor_strength(king2.getArmor_strength() * 0.9); 
        king2.setWarriors((int) (king2.getWarriors() * 0.85)); 
        System.out.println(" shoots arrows on " +  king2.getName());
        System.out.println(king2.getName() + " looses 10 % armor strength and has" + king2.getWarriors() + " warriors");        
    }
    
    public String toString(){
        return "bows and arrows";
    }
    
}
