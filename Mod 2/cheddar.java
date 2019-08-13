public class cheddar extends cheese{
  
    public static int addNumber(int [] arr){
        int total = 0;
        cheese.sort(arr);
          for (int i = 0; i < arr.length; i++){
            total = total + arr[i];
          };
        return total;
    }
    
}
