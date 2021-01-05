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
public class SpecialAttackSmokeBomb implements SpecialAttack{

    @Override
    public void proceedAttack(Kings king1, Kings king2, int damageStrength) {
       king2.setStrength(king2.getStrength() * 0.85); 
        king2.setWarriors((int)(king2.getWarriors() * 0.9)); 
        System.out.println("smoke bomb on " +  king2.getName());
        System.out.println(king2.getName() + " looses 15 % strength and has" + king2.getWarriors() + " warriors");        
        
     }
    
    public String toString(){
        return "smoke bomb";
    }
    
}
