import java.util.ArrayList;
import java.util.Arrays;
public class sum {
    public static ArrayList<Integer> sumOf(ArrayList<Integer> numbers) {
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                evenSum+=numbers.get(i);
            }
            else{
                oddSum+=numbers.get(i);
            }
        }
        ArrayList<Integer> sums = {evenSum,oddSum};
        return sums;
    }
}        
    