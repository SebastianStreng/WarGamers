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
    
    int warriors; 
    double strength; 
    RandomGenerator randGen;
/*    double weapon_strength;
    double armor_strength; */
    String name; 
    
    double attack_skill = strength/warriors; 
    
    Kings(String name, RandomGenerator randGen){
        this.randGen = randGen;
        double factor = randGen.getRandPerc();
        this.warriors = (int) (1000 * factor); // Gewichten des Krieger-Anzahl
        factor = randGen.getRandPerc();
        this.strength = 1000 * factor;  // Gewichten des Stärke jedes Kriegers
        this.name = name;
    }
    
    public String toString(){
        String s=name+"\n";
        s += "Warriors: \t"+this.warriors+"\n";
        s += "Strength: \t"+this.strength;
        return s;
    }

    public double attackPower(){
        return warriors * strength;
    }
    
    public void casualties(int warriorLoss){
        this.warriors -= warriorLoss;
    }
    
    public void escaping(){
        this.warriors = (int) (this.warriors * 0.95);
    }
    
    public void reduceStregth(){
        this.strength *= 0.85;
    }
    
    public boolean isAlive(){
        if (warriors > 0) return true;
        else return false;
    }
    
    public void attack(Kings k) { //Attacking another king
        int reaction = k.getReactionOnAttack();

        switch (reaction) {
            case 1: System.out.println("esacpe");k.escaping(); break;//escape
            case 2: ;//defecting
            default: { //fighting
                System.out.println("Attack");
                double attackPowerK = k.attackPower(); 
                double attackPowerThis = this.attackPower();
                this.reduceStregth();
                k.reduceStregth();
                
                int warriorLoss = (int) (Math.abs(attackPowerK - attackPowerThis)/100);           

                System.out.println(attackPowerK+" "+attackPowerThis+" "+warriorLoss);
                
                if (attackPowerK > attackPowerThis) {
                    k.casualties(warriorLoss);
                } else if (attackPowerK < attackPowerThis) {
                    this.casualties(warriorLoss);
                } else {
                    k.casualties(warriorLoss);
                    this.casualties(warriorLoss);
                }
            }
        }
    }
    

    public int getReactionOnAttack() {
        return randGen.getRandReaction();
    }

}



/*    
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
    
    */
    

