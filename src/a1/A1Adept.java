package a1;

import java.util.*;

class A1Adept {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //reads the number of unique items
        
        HashMap<String, Double> map = new HashMap<String, Double>();
        for(int i=0; i<n; i++)
        {
            String name = scan.next();
            double cost = scan.nextDouble();
            map.put(name, cost);
        }
        //maps each unique item and its respective cost in a hash
        
        int people = scan.nextInt();
        //reads the number of customers
        
        container[] data = new container[people];
        //inheritance method, implementing an interface for comparison
        
        for(int i=0; i<people; i++)
        {
            String first = scan.next();
            String last = scan.next();
            int item = scan.nextInt();
            double cost =0;
            for(int j=0; j<item; j++)
            {
                int number = scan.nextInt();
                String type = scan.next();
                cost += number * map.get(type);
            }
            data[i] = new container(first + " " + last, cost);
        }
        //adding data into hashmap and people data into container class
        
        Arrays.sort(data);
        System.out.println("Biggest: " + data[data.length-1].name + " (" + String.format("%.2f", data[data.length-1].income) + ")");
        System.out.println("Smallest: " + data[0].name + " (" + String.format("%.2f", + data[0].income) + ")");
        double average =0;
        //sorts arrays into format desired
        
        for(int i=0; i<data.length; i++)
        {
            average += data[i].income;
        }
        //iteration to calculate average
        
        System.out.println("Average: " + String.format("%.2f",average/data.length));
    }   //output in desired format rounded to two decimal places
}

//container class for inheritance method. Stores customer data for comparison.
class container implements Comparable<container>
{
    String name;
    double income;
    public container(String name, double income)
    {
        this.name = name;
        this.income = income;
    }
    //conditional to sort customers by spending
    public int compareTo(container other)
    {
        if(this.income < other.income)return -1;
        else if (this.income>other.income)return 1;
        return 0;
    }
}