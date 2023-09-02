import java.util.*;

class Complex {
  Complex() {
  }
  public void Add(int ar, int ai, int br, int bi) {
    ai += bi;
    ar += br;
    Print(ar, ai);
  }
  public void Subtract(int ar, int ai, int br, int bi) {
    ai -= bi;
    ar -= br;
    Print(ar, ai);
  }
  public void Multiply(int ar, int ai, int br, int bi) {
    int cr = (ar * br) - (ai * bi);
    int ci = (ar * bi) + (br * ai);
    ar = cr;
    ai = ci;
    Print(ar, ai);
  }
  public void Print(int ar, int ai) {
    if ( ai >= 0 ) System.out.println(ar + "+" + ai + "i");
    else System.out.println(ar + "-" + (-ai) + "i");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ar, ai, br, bi;
    // System.out.println("Enter the real and imaginary parts of the first complex number: ");
    ar = sc.nextInt();
    ai = sc.nextInt();
    br = sc.nextInt();
    bi = sc.nextInt();
    int choice = sc.nextInt();
    Complex com = new Complex();
    switch (choice){
        case 1:
            com.Multiply(ar, ai, br, bi);
            break;
        case 2:
            com.Add(ar, ai, br, bi);
            break;
        case 3:
            com.Subtract(ar, ai, br, bi);
            break;
        default:
            System.out.println("Error");
            break;
    }
    sc.close();
  }
}