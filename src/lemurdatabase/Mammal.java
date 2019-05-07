/*

*/

package lemurdatabase;

/**
 *
 * @author lewhi7273
 */
public class Mammal extends LemurDatabase{
  private int itsAge;
  private int itsWeight;
  private String breed , gender;

  public Mammal() {
    itsAge = 2;
    itsWeight = 5;
  }

  public int getAge() {
    return itsAge;
  }
  public String getGender(){
      return gender;
  }
 
  public int getWeight() {
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
     String output = "Age = " + itsAge + "\nWeight = " + itsWeight + "\nGender = " + gender + "\n";
        return output;
  }
}
    

