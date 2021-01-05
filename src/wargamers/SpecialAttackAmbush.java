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
public class SpecialAttackAmbush  implements SpecialAttack{

    @Override
    public void proceedAttack(Kings king1, Kings king2, int damageStrength) {
     int warriorloss = wargamers.RandomGenerator.generateRandom(150, 300);
        king2.setWarriors(king2.getWarriors() - warriorloss); 
        System.out.println("an ambush has been startet.");
        System.out.println(king2.getName() + "looses" + warriorloss + " warriors.");
        System.out.println(king2.getName() + " has " + king2.getWarriors() + " left.");  
    }
    public String toString(){
        return "ambush";
    }
       
}
