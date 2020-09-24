package First;

import java.util.Scanner;
import static java.lang.System.out;
public class Input1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        out.println("解一元二次方程");
        out.println("请输入整数 a d c");

        out.print("a = ");
        a = in.nextInt();
        out.print("b = ");
        b = in.nextInt();
        out.print("c = ");
        c = in.nextInt();

        double t = b*b - 4*a*c;

        if(t == 0){
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            out.println("只有一个根, x= " + x1);
        }else if( t > 0)
        {
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            double x2 = ((-b - Math.sqrt(t))/(2*a));
            out.println("有两个根, x1 = " + x1 + " x2 = "+x2);
        }else{
            out.println("没有根");
        }
    }
}
