import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[]arr={9,8,7,6,5,4,3,2,1};
        bubble(arr);
    }
    static void bubble(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    
}
