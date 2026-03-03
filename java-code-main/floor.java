public class floor {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,63,77,88,99};
        int target=64;
        int ans=floornumber(arr,target);
        System.out.println(ans);
    }
    static int floornumber(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return nums[mid];
            }

            if(nums[mid]>target){
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        return nums[e];
    }
    
}
