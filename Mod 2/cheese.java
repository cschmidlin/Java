public class cheese{

    public static void sort(int [] arr){
       for(int i = 0; i < arr.length - 1; i++){
         for(int j = 0; j < arr.length - 1; j++){
           if (arr[i+1] < arr[j]){
             int temp = arr[j];
             arr[j] = arr[i+1];
             arr[i+1] = temp;
         }
       }
     }
    }
}
