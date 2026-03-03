
public class linearsearch {
    public static void main(String[] args) {
        int [] nums={22,44,5,66,77,88,99,11,222,33,44,3};
        int target =222;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    

    }
    //search in the ARRAY :return the index if item found
   
  

 static  int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int i =0;i<arr.length;i++){
            int a=arr[i];
           if(a==target){
            return i;
           }
        }
        return 0;
    }
    
}