package First;

import java.util.Scanner;
import static java.lang.System.out;
public class Input1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        out.println("��һԪ���η���");
        out.println("���������� a d c");

        out.print("a = ");
        a = in.nextInt();
        out.print("b = ");
        b = in.nextInt();
        out.print("c = ");
        c = in.nextInt();

        double t = b*b - 4*a*c;

        if(t == 0){
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            out.println("ֻ��һ����, x= " + x1);
        }else if( t > 0)
        {
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            double x2 = ((-b - Math.sqrt(t))/(2*a));
            out.println("��������, x1 = " + x1 + " x2 = "+x2);
        }else{
            out.println("û�и�");
        }
    }
}
