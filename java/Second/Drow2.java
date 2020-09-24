package Second;

public class Drow2 {
    public static void main(String[] args) {
        //»­Èý½ÇÐÎ
        int i, j;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 8 - i; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println("");
        }

    }
}
