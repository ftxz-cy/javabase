package Second;

//��������
public class Drow1 {
    public static void main(String[] args) {

        int i, j;

        for(i=0;i<9;i++)
        {
        	for(j=0;j<8-i;j++)
        		System.out.print(" ");
			for(j=0;j<9;j++)
        		System.out.print("*");

        	System.out.println("");

        }

    }
}
