import java.util.Arrays;
public class sortedmatrix {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(Arrays.toString(search(arr,99)));
    }
    static int[]binarySearch(int[][]matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};

    }

static int[] search(int [][]matrix,int target){
    int rows=matrix.length;
    int cols=matrix[0].length;
    if(rows==1){
        return binarySearch(matrix,0,0,cols-1,target);
    }
    int rStart=0;
    int rEnd =rows-1;
    int cmid=cols/2;
    while(rStart<(rEnd-1)){
        int mid =rStart+(rEnd-rStart)/2;
        if(matrix[mid][cmid]==target){
          return new int[] {mid,cmid};
        }
        if(matrix[mid][cmid]<target){
            rStart=mid;
        }
        else{
            rEnd=mid;
        }
    }
    if(matrix[rStart][cmid]==target){
        return new int []{rStart,cmid};
    }
    if(matrix[rStart+1][cmid]==target){
        if(target<=matrix[rStart][cmid-1]){
            return binarySearch(matrix,rStart,0,cmid-1,target);
        }
        if(target<=matrix[rStart][cmid+1]&&target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,0,cmid+1,target);
        }
        if(target<=matrix[rStart][cmid-1]){
            return binarySearch(matrix,rStart+1,0,cmid-1,target);
        }
        if(target<=matrix[rStart][cmid-1]){
            return binarySearch(matrix,rStart+1,cmid+1,cmid-1,target);
        }
    }
    return new int[]{-1,-1};

    
}
}