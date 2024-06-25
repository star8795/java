package test01;

public class Problem06 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                if (j == 9) { 
                    System.out.println();
                }
            }
        }
    }
}
