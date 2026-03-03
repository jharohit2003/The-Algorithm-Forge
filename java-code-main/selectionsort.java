import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,2,1};
        System.out.println(Arrays.toString(selection(arr)));
    }
    static int maxValue(int []arr,int start,int end){
       int max=start;
       for(int i=0;i<=end;i++){
        if(arr[i]>arr[max]){
            max=i;
        }
       } 
       return max;
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] selection(int[] arr){
      
        
        for(int i=0;i<arr.length;i++){
              int start=0;
        int last =arr.length-i-1;
       int max=maxValue(arr,start,last);
       
        swap(arr,max,last);
       
        }
        return arr;
    }
    
}
