import java.util.*;

class Box {
  int height;
  int width;
  int breadth;

  Box() {
    this.height = this.width = this.breadth = 0;
  }

  Box(int height, int width, int breadth) {
    this.height = height;
    this.width = width;
    this.breadth = breadth;
  }

  Box(int height) {
    this.height = this.width = this.breadth = height;
  }

  public int getVolume() {
    return (this.height * this.width * this.breadth);
  }
  
  public static void main(String[] args) {
    System.out.println("Enter a letter for the type of box: (R - Cuboid, C - Cube, Other - Cuboid of dimensions 0");
    Scanner sc = new Scanner(System.in);
    char c = Character.toUpperCase(sc.next().charAt(0));
    if (c == 'R') {
      System.out.println("Enter the dimensions (Height, width, Breadth):");
      int height = sc.nextInt();
      int width = sc.nextInt();
      int breadth = sc.nextInt();
      Box b = new Box(height, width, breadth);
      System.out.println("Volume (cubic units): " + b.getVolume());
    }
    else if (c == 'C') {
      System.out.println("Enter the length of the side: ");
      int side = sc.nextInt();
      Box b = new Box(side);
      System.out.println("Volume (cubic units): " + b.getVolume());
    }
    else {
      Box b = new Box();
      System.out.println("Volume (cubic units): " + b.getVolume());
    }
    sc.close();
  }
}