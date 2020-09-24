package Second;

public class Drow3 {
    public static void main(String[] args) {
        int i,j;
        //»­ÌÝÐÎ
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 8 - i; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            System.out.println("");

        }
        for (i = 7; i >= 0; i--) {
            for (j = 0; j < 8 - i; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            System.out.println("");

        }
    }
}
