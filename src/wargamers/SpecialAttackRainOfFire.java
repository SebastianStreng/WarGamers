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
public class SpecialAttackRainOfFire implements SpecialAttack{

    @Override
    public void proceedAttack(Kings king1, Kings king2, int damageStrength) {
        king2.setArmor_strength(king2.getArmor_strength() * 0.7); 
        king2.setWarriors((int)(king2.getWarriors() * 0.75)); 
        System.out.println("burning arrows on " +  king2.getName());
        System.out.println(king2.getName() + " looses 30 % armor strength and has" + king2.getWarriors() + " warriors");        
    }
    public String toString(){
        return "rain of fire";
    }
    
}
