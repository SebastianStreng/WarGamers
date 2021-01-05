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
public class SpecialAttackAdditionalWarriors  implements SpecialAttack{

    @Override
    public void proceedAttack(Kings king1, Kings king2, int damageStrength) {
        int added_warriors = wargamers.RandomGenerator.generateRandom(50, 400);
        king1.setWarriors(king1.getWarriors() + added_warriors);
        System.out.println(king1.getName()+" gets support by " + added_warriors +  " new warriors.");
        System.out.println(" and has" + king1.getWarriors() + " warriors");

    }
    public String toString(){
        return "additional warriors";
    }

}
