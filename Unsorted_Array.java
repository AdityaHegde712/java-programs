import java.util.Scanner;
class Unsorted_Array {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // System.out.print("Input size of array: ");
    int size = in.nextInt();
    int a[] = new int[size];
    int largestNum = -1;
    int secondNum = -1;

    // Input the array
    for (int i = 0; i < size; i++) {
      a[i] = in.nextInt();
    }

    // Boundary conditions
    if (size == 0) {
        System.out.println(0 +","+ 0);
        System.exit(0);
    }
    else if (size == 1) {
        System.out.println(a[0]+","+0);
        System.exit(0);
    }

    // Find the largest number in the array
    int lindex = -1;
    for (int i = 0; i < size; i++) {
        if (a[i] > largestNum) {
            largestNum = a[i];
            lindex = i;
      }
    }
    a[lindex] = -1;

    // Find the second largest element in the array
    lindex = -1;
    for (int i = 0; i < size; i++) {
        if (a[i] > secondNum) {
            secondNum = a[i];
            lindex = i;
      }
    }
    
    System.out.println(largestNum +","+ secondNum);
    in.close();
  } 
}    

