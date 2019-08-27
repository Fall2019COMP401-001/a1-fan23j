import java.util.*;
import java.io.*;

class A1Novice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[][] names = new String[n][2];
        String[][][] data = new String[n][][];
        for(int i=0; i<n; i++)
        {
            String first = scan.next();
            String last = scan.next();
            names[i][0] = first;
            names[i][1] = last;
            int num = scan.nextInt();
            data[i] = new String[num][3];
            for(int j=0; j<num; j++)
            {
                data[i][j][0] = scan.next();
                data[i][j][1] = scan.next();
                data[i][j][2] = scan.next();
            }
        }
        for(int i=0; i<data.length; i++) {
            double price = 0;
            for (int j = 0; j < data[i].length; j++) {
                price += Double.parseDouble(data[i][j][0]) * Double.parseDouble(data[i][j][2]);
            }
            System.out.println(names[i][0].charAt(0) + ". " + names[i][1] + ": " + String.format("%.2f", price));
        }
    }
}