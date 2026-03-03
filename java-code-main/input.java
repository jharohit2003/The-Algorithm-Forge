import java.util.*;
public class input {
    public static void main(String[] args) {
        System.out.println("input  integer in java");
        try (Scanner var = new Scanner(System.in)) {
            int i=var.nextInt();
             System.out.println("input string in java");
            try (Scanner input2 = new Scanner(System.in)) {
                String a=input2.nextLine();
                System.out.println(i);
                System.out.println(a);
            }
        }
    }
    
}
