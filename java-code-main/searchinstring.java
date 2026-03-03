public class searchinstring {
    public static void main(String[] args) {
        String a ="rohit jha";
    char target = 'u';
    boolean ans =strsearch(a,target);
    System.out.println(ans);


    }
    static boolean strsearch(String str,char t){
      if(str.length()==0){
        return false; 
      }  
      for(int i=0;i<str.length();i++){
        if(t==str.charAt(i)){
            return true;
        }
      }
      return false;
    }

    
}
