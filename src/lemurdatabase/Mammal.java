/*

*/

package lemurdatabase;

/**
 *
 * @author lewhi7273
 */
public class Mammal extends LemurDatabase{
  private int itsAge, chosenGend;
  private double itsWeight;
  private String breed , gender;

  public Mammal() {
 itsAge = (int)(Math.random() * 12 + 1);
 itsWeight = (Math.random() * 5 + 1);
 chosenGend = (int)((Math.random()) * 2);
 
 if(chosenGend == 1){
     gender = "Male";
 }else
     gender = "Female";
  }

  public int getAge() {
    return itsAge;
  }
  public String getGender(){
      return gender;
  }
 
  public double getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public void setGender(String gend){
     gender = gend;
}

  

  public String toString() {
     String output = "Age = " + itsAge + "\nWeight = " + itsWeight + " KG \nGender = " + gender + "\n";
        return output;
  }
}
    

