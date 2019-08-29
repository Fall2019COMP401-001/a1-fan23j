package a1;

import java.util.*;

class scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Double> map = new HashMap<String, Double>();
        for(int i=0; i<n; i++)
        {
            String name = scan.next();
            double cost = scan.nextDouble();
            map.put(name, cost);
        }
        int people = scan.nextInt();
        container[] data = new container[people];
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
        Arrays.sort(data);
        System.out.println("Biggest: " + data[data.length-1].name + " (" + data[data.length-1].income + ")");
        System.out.println("Smallest: " + data[0].name + " (" + data[0].income + ")");
        double average =0;
        for(int i=0; i<data.length; i++)
        {
            average += data[i].income;
        }
        System.out.println("Average: " + (average/data.length));
    }
}
class container implements Comparable<container>
{
    String name;
    double income;
    public container(String name, double income)
    {
        this.name = name;
        this.income = income;
    }
    public int compareTo(container other)
    {
        if(this.income < other.income)return -1;
        else if (this.income>other.income)return 1;
        return 0;
    }
}