package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
public class Input2 {
    public static void main(String[] args) throws IOException {
        int a,b,c;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        out.println("解一元二次方程");
        out.println("请输入整数 a d c");

        out.print("a = ");
        a = Integer.parseInt(in.readLine());
        out.print("b = ");
        b = Integer.parseInt(in.readLine());
        out.print("c = ");
        c = Integer.parseInt(in.readLine());

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
