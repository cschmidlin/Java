import java.util.Arrays;
import java.util.Scanner;
public class main{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      cheddar cheddarObject = new cheddar();

      System.out.print("How long of an array do you want? ");
      int size = in.nextInt();

      int arr[] = new int [size];

      for (int i = 0; i < size; i++){
        System.out.print("Random number please: ");
        arr[i] = in.nextInt();
      }

      System.out.println("----------------------------------------");
      int total = cheddarObject.addNumber(arr);
      System.out.println("The TOTAL for the array is " + total);

      System.out.print("The sorted array is " + Arrays.toString(arr));
      
      System.out.print("\n");
      System.out.println("----------------------------------------");
    }
}
 
