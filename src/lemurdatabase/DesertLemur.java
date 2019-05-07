/*
 */

package lemurdatabase;

/**
 *
 * @author lewhi7273
 */
public class DesertLemur extends Lemur {

public String toString(){
    String output = "Desert Lemur:\n";
  output +=  super.toString() + "\n";
output += "Food: Cacti\n";
output += "Coat: White\n";
output += "Baby Death Rate: 0.66";
return output;
}
}