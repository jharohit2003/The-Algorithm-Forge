public class ceilingofanumber {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,9,14,16,17,18};
        int target=15;
        int  ans =binarySearch(arr,target);
        System.out.println(ans);
        
    }


    static int binarySearch( int[] nums,int t){
        int s=0;
        int e =nums.length-1;
        

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                return nums[mid];
            }
            if(nums[mid]>t){
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        
            return nums[s];
        
    }

}

    

    
    

