/*
 * Lewis White
 * May 02
 * This program will simulate a lemur database
 */

package lemurdatabase;

import java.util.Scanner;

/**
 *
 * @author lewhi7273
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lemurCount, type;
       // int i = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many Lemurs would you like to generate?");
        lemurCount = input.nextInt();
        Lemur[] lemurs = new Lemur[lemurCount];
        
        for(int i = 0; i< lemurCount; i++){
            System.out.println("What type of lemur are you adding?\n"
                    + "1. Desert\n"
                    + "2. Tree\n"
                    + "3. Jungle");
            type = input.nextInt();
            
            if (type == 1){   
            Mammal bertha = new Mammal();
            bertha.setAge(897);
            bertha.setGender("Female");
            bertha.setWeight(987);
            lemurs[i] = new DesertLemur();
         
            
        }else if (type ==2){
           
            Mammal john = new Mammal();
            john.setAge(99);
            john.setGender("Male");
            john.setWeight(45);
       
           lemurs[i] = new TreeLemur();
        }else if (type == 3){
            lemurs[i] = new JungleLemur();
            Mammal jack = new Mammal();
            jack.setAge(10);
            jack.setGender("Male");
            jack.setWeight(67);

        }else{
                System.out.println("Please enter a valid entry!");
                lemurCount++;
        }
            
            }
         for(int j =0; j < lemurCount; j++){
             System.out.println("------------------------------");
                 System.out.println(lemurs[j]);
         }
    }
}

    

