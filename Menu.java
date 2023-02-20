import java.util.*;
public class Menu {
    public static void main(String[] args) {

         int choice;
         int average =0;
         System.out.println("-------------------------------------------");
         System.out.print("Choose your Arraysize : ");
         Scanner sc = new Scanner(System.in);
         int arraySize = sc.nextInt();
         sc.nextLine();
         int[]arr = new int[arraySize];
         Random rand = new Random(101);
         for (int n=0; n<arr.length; n++){
             arr[n]= rand.nextInt(0, 100);
         }
         
    do{
    System.out.println(" -------------- Menu: "+ "-------------------");
    System.out.println();
    String sform = String.format("%s%n%s%n%s%n%s%n%s%n", "1 - Find the minimum and the maximum" ,"2 - Find the average", "3 - Find the sum of elements with odd and even numbered", "4 - Display the Array","5 - Exit");
    System.out.println(sform);
    System.out.println("-------------------------------------------");
    System.out.print("Your choice: ");
    choice = sc.nextInt();
    sc.nextLine();

      //min and max of arrays
    if(choice ==1){
      MaxMinArray.ArrayMaxMin(arr);

    }
    //average
    if(choice ==2){
      int sum =0;

         for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
         }
          average = sum / arr.length;
          int[]average_array = new int[arr.length];

          for (int i = 0; i < average_array.length; i++) {
             average_array[i] = arr[i]- average;
          }
          System.out.println("The average is: " + average);
          System.out.print("Differences from the average :" + "{ ");
          for (int i : average_array) {
            System.out.print(i +" ");
          }
          System.out.print("}");
          System.out.println();
       
    }
    //sums of even and odds
    if(choice ==3){
      ArrayList<Integer> sums = new ArrayList<Integer>();
      for(int b = 0; b < arr.length; b++){
         sums.add(arr[b]);
      }
      sums = sum.sumOf(sums);
      System.out.print("Sum of the evens : " + sums.get(0));
      System.out.print("Sum of the odds : " + sums.get(1));
    }
    if(choice == 4) {
      System.out.println(Arrays.toString(arr));
    }
   }
   while(choice != 5);

}

}
