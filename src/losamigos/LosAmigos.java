/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package losamigos;

/**
 *
 * @author StefanosZisidis
 */
public class LosAmigos {

    /**
     * @param args the command line arguments
     */
//    Initialize arrays for names, ages, and points with the given data.
//Set a variable to track the oldest age and its index.
//Loop through the age array:
//If the current age is greater than the current oldest age, update the oldest age and the index.
//Once the loop is complete, output the name, age, and points of the oldest member using the index.
    public static void main(String[] args) {

        //initialising arrays
        String[] names = {"BOSS", "BLOCK", "BRAWN", "BRAYNT", "CLORKSAN"};
        int[] ages = {30, 24, 23, 37, 23};
        int[] points = {473, 133, 115, 1161, 1225};

        int oldestAge = ages[0];
        int indexOfOA = 0;

        int youngestAge = ages[0];
        int indexOfYA = 0;

        for (int i = 0; i < ages.length; i++) {
            if (oldestAge < ages[i]) {
                oldestAge = ages[i];
                indexOfOA = i;
            }
        }

        for (int i = 0; i < ages.length; i++) {
            if (youngestAge > ages[i]) {
                youngestAge = ages[i];
                indexOfYA = i;
            }
        }

        // Question 1
        System.out.println("\nQuestion 1");
        System.out.println("----------");
        System.out.println("Oldest player: " + names[indexOfOA]);
        System.out.println("Age: " + ages[indexOfOA]);
        System.out.println("Points: " + points[indexOfOA]);

        // Question 2
        System.out.println("\n\nQuestion 2");
        System.out.println("----------");
        System.out.println("Youngest player: " + names[indexOfYA]);
        System.out.println("Age: " + ages[indexOfYA]);
        System.out.println("Points: " + points[indexOfYA]);

    }
    
    
    
    

//Initialize the arrays for names, ages, and points.
//Loop through the ages array to find the index of the oldest player.
//Output the details (name, age, and points) of the player with the highest age.
    

}
