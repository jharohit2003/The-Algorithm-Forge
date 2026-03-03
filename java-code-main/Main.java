
public class Main{
    public static void main(String[]args){
        int []arr={22,44,5,66,77,88,99,11,22,33,44,3};
        int target =44;
        int ans =Search(arr,target);
        System.out.println(ans);
    
    }
    static  int Search(int[] nums , int target){
      
        
        for(int i =0;i<nums.length;i++){
            
            if(nums[i]==target){
            return i;
            }
        
    }
    
    return -1;
    

}
}