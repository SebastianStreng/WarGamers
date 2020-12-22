/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamers;
import java.util.Random; 

/**
 *
 * @author sebas
 */
public class RandomGenerator {
    
    Random cube;
    
    RandomGenerator(){
         cube = new Random();
    }


    public double getRandPerc(){ // Delivers Factor between 95% and 105%
        double randomNbr = cube.nextDouble(); // Random number between 0 and 1 
        return (randomNbr *0.2) + 0.9; 
    }
            
    
    public int getRandReaction(){
        return cube.nextInt(3);
    }
    
    
    
    
}
