/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author lewhi7273
 */
public class TreeLemur extends Lemur {
    
    
    public String toString(){
        String output = "Tree Lemur:\n";
        output += super.toString() + "\n";
        output += "Pack Size: Large\n";
        output += "Food: Fruit\n";
        output += "Coat: Red\n";
     return output;      
    }
}
