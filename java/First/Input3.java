package First;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
public class Input3 {
    public static void main(String[] args) throws IOException {
        int a,b,c;


        String str = JOptionPane.showInputDialog("����������a b c,�ÿո�ֿ�");

        String[] abc = str.split(" ");


        a = Integer.parseInt(abc[0]);
        b = Integer.parseInt(abc[1]);
        c = Integer.parseInt(abc[2]);

        double t = b*b - 4*a*c;
        String info;

        if(t == 0){
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            info = "ֻ��һ����, x= " + x1;
        }else if( t > 0)
        {
            double x1 = ((-b + Math.sqrt(t))/(2*a));
            double x2 = ((-b - Math.sqrt(t))/(2*a));
            info = "��������, x1 = " + x1 + " x2 = "+x2;
        }else{
            info = "û�и�";
        }

        JOptionPane.showMessageDialog(null,info);
    }
}
