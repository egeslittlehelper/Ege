import java.util.Scanner;

/**
 * sdfsgs
 */
public class optionD {

    public static int[] averageDist( int[] givenInts){

        

        int sum = 0;

        for(int i =0; i < givenInts.length;i++)
        {
            sum += givenInts[i];
        }
        int average = sum/givenInts.length;

        for(int i = 0; i < givenInts.length;i++)
        {
            givenInts[i] -= average;
        }
        return givenInts;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers will this array contain?");
        int arraylngth = in.nextInt();

        int[] givenArray = new int[arraylngth];
        for(int b = 0; b < arraylngth; b++)
        {
        System.out.print("Enter the elements of integers:");
        givenArray[b] = in.nextInt();

        }
        in.nextLine();
        System.out.print("Distance from average for each integer is" + averageDist(givenArray));
    }

    
}