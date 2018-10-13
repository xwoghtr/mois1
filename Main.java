import java.lang.*;
public class Main {


    public static void main(String[] args) {


        System.out.println(" \n\n  ");
        float x1 = 0.01f;
        double y1 = 0.01d;
        float x2 = 0.01f;
        double y2 = 0.01d;
        int n = 31;
        for (int i = 0; i < n; i++) {
            x1 = x1 + 3 * x1 * (1 - x1);
            y1 = y1 + 3 * y1 * (1 - y1);
            x2 = 4 * x2 - 3 * x2 * x2;
            y2 = 4 * y2 - 3 * y2 * y2;

            System.out.printf("Krok=%d  Float= %f Double= %f\n", i, x1, y1);


            //System.out.println(" [ " + i + " ] " + "   float " + x1 + " = " + "    double " + y1 + "  //  " + x2 + " = " + y2);



        }
    }
}