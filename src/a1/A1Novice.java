package a1;

import java.util.*;

class A1Novice {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        //initializes scanner
        
        int n = scan.nextInt();
        //reads number of customers
        
        String[][] names = new String[n][2];
        // set up 2d array for customer names
        
        String[][][] data = new String[n][][];
        //set up 3d array for purchase info
        
        for(int i=0; i<n; i++)
        	//for loop iterates n times (number of customers)
        {
            String first = scan.next();
            String last = scan.next();
            names[i][0] = first;
            names[i][1] = last;
            //scans first and last name of customer and stores them into the names array
            
            int num = scan.nextInt();
            //retrieves number of unique items bought by each customer
            
            data[i] = new String[num][3];
            //stores num into data array. Second index default 3 due to three different attributes of each item.
            for(int j=0; j<num; j++)
            	//inputting data into data array
            {
                data[i][j][0] = scan.next();
                //number of unique item
                
                data[i][j][1] = scan.next();
                //item name
                
                data[i][j][2] = scan.next();
                //item cost
            }
        }
        for(int i=0; i<data.length; i++) {
        	//translating data in data array
        	
            double price = 0;
            for (int j = 0; j < data[i].length; j++) {
                price += Double.parseDouble(data[i][j][0]) * Double.parseDouble(data[i][j][2]);
                //retrieves numerical data from items for computation
            }
            System.out.println(names[i][0].charAt(0) + ". " + names[i][1] + ": " + String.format("%.2f", price));
            //output first character of first name index and all of the next.
            //round price to two decimal places
        }
    }
}