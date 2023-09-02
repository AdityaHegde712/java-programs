public class basics {
    public void BitwiseOp() {
        String binary[] = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3, b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("        a = " + binary[a]);
        System.out.println("        b = " + binary[b]);
        System.out.println("      a|b = " + binary[c]);
        System.out.println("      a&b = " + binary[d]);
        System.out.println("      a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("       ~a = " + binary[g]);
    }
    public void BitwiseShift() {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
    public void controlsfor() {
        int i;
        boolean done = false;
        i = 0;
        for(; !done; ) {
            System.out.println("i is " + i);
            if(i == 10) done = true;
            i++;
        }
    }
    public void controls_for_each() {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
    public void arrays() {
        // 2 d arrays
        int[][] twoD = new int[4][5];
        int i, j, k = 0;
        for(i = 0; i < 4; i++)
            for(j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
    public void jagged_arrays() {
        int[][] jagged = new int[3][];
        jagged[0] = new int[4];
        jagged[1] = new int[3];
        jagged[2] = new int[5];
        int i;
        for(i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++)
                jagged[i][j] = i + j + 1;
        }
        for(i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++)
                System.out.print(jagged[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String args[]) {
        basics a = new basics();
        // a.BitwiseOp();
        // a.BitwiseShift();
        // a.controlsfor();
        // a.controls_for_each();
        // a.arrays();
        a.jagged_arrays();
    }
}
