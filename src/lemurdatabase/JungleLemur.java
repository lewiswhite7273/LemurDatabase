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
public class JungleLemur extends Lemur {
    
    
    public String toString(){
        String output = "Jungle Lemur:\n";
        output += super.toString() + "\n";
        output += "Colour: Black or Blue\n";
        output += "Coat: White\n";
        output += "Pack Size: Small\n";
        output += "Food: Small mice, insects;";
        return output;
    }
}
