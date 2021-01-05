/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import java.lang.Math;
import java.util.Scanner;


/**
 *
 * @author sebas
 */
public class Kings {
    
    String name; 
    private int warriors; 
    private double strength; //nach jedem angriff um 10% senken - funktion bauen erholung - random erholung 
    private double weapon_strength;
    private double armor_strength; 
    SpecialAttack a1;
    SpecialAttack a2;

    Kings(String name, int warriors, double strength, double weapon_strength, double armor_strength){
        this.name = name;
        this.warriors = warriors;
        this.strength = strength;
        this.weapon_strength = weapon_strength;
        this.armor_strength = armor_strength;
        
        int a1Random = wargamers.RandomGenerator.generateRandom(1,5);
        switch(a1Random){
            case 1: this.a1 = new SpecialAttackBowAndArrow(); break;
            case 2: this.a1 = new SpecialAttackRainOfFire(); break;
            case 3: this.a1 = new SpecialAttackSmokeBomb(); break;
            case 4: this.a1 = new SpecialAttackAdditionalWarriors(); break;
            case 5: this.a1 = new SpecialAttackAmbush(); break;
        }
        
        int a2Random = wargamers.RandomGenerator.generateRandom(1,5);
        while (a2Random == a1Random){
            a2Random = wargamers.RandomGenerator.generateRandom(1,5);
        }
        switch(a2Random){
            case 1: this.a2 = new SpecialAttackBowAndArrow(); break;
            case 2: this.a2 = new SpecialAttackRainOfFire(); break;
            case 3: this.a2 = new SpecialAttackSmokeBomb(); break;
            case 4: this.a2 = new SpecialAttackAdditionalWarriors(); break;
            case 5: this.a2 = new SpecialAttackAmbush(); break;
        }
    }
    
    @Override
    public String toString() {
        String s = name+ "\n" + "Warriors: " + warriors + "\n";
        s += "strength: " + strength + "\n";
        s += "weapon strength: " + weapon_strength + "\n";
        s += "armor strength: " + armor_strength + "\n";
        s+= "special attacks: "+ a1.toString() + ", "+a2.toString()+"\n";
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWarriors() {
        return warriors;
    }

    public void setWarriors(int warriors) {
        this.warriors = warriors;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getWeapon_strength() {
        return weapon_strength;
    }

    public void setWeapon_strength(double weapon_strength) {
        this.weapon_strength = weapon_strength;
    }

    public double getArmor_strength() {
        return armor_strength;
    }

    public void setArmor_strength(double armor_strength) {
        this.armor_strength = armor_strength;
    }

    public void selectInteraction(Kings king2, int damageStrength) {

        System.out.println("Please select one of the following interactions: ");

        System.out.println("1. attack");
        System.out.println("2. run over");
        System.out.println("3. speacial Attack");

        Scanner myScanner = new Scanner(System.in);
        int decision = myScanner.nextInt();

        switch (decision) {
            case 1:
                this.attack(king2, damageStrength);
                break;
            case 2:
                this.run_over_King(king2);
                break;
            case 3:
                int spAtRandom = wargamers.RandomGenerator.generateRandom(1,2);
                if (spAtRandom == 1) this.a1.proceedAttack(this, king2, damageStrength);
                else this.a2.proceedAttack(this, king2, damageStrength);
                break;
            default:
                System.out.println("please type the right number of your prefered attack. ");
                break;
        }
    }
    
    public void attack(Kings king2, int damageStrength){
         
         king2.setWarriors((int) (king2.getWarriors() * 0.7)); 
         System.out.println(this.name + " has attacked " + king2.getName() + "´s armee. " +
                 king2.getName() + " has now " + king2.getWarriors() + " warriors left.");
    }
     
    
    
    public void run_over_King(Kings king2){
        int run_over_indicator = wargamers.RandomGenerator.generateRandom(1, (int) king2.getWarriors());
        king2.setWarriors(king2.getWarriors() - run_over_indicator); 
        this.warriors = this.warriors + run_over_indicator; 
        System.out.println(run_over_indicator + " warriors leave " +  king2.getName() + "´s army and change sites."); 
    }
/*    
    public void specialAttack (Kings king1, Kings king2){
        wargamers.SpecialAttack.startSpecialAttack(king1, king2);
        
    }
*/    
    
  

}
