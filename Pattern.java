import java.util.*;
public class Pattern {
    public static void pattern(int rows){
        for(int i = 1; i <= rows; i++) {
            int start = i;
            // Create Spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = start; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = rows-1; i >= 1; i--) {
            int start = i;
            // Create Spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = start; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number ");  
        int n= sc.nextInt();  
        pattern(n);
        sc.close();
    }
}
