package a1;
import java.util.*;
import java.io.*;

class A1Jedi
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    //initiate scanner
    
    int n = scan.nextInt();
    //reads number of unique items
    
    String[] order = new String[n];
    //creates empty array 'order' with index count n
    
    for(int i=0; i<n; i++)
    {
      String s = scan.next();
      double cost = scan.nextDouble();
      order[i] = s;
    }
    //fills order array with respective cost
    
    HashMap<String, Integer> number = new HashMap<String, Integer>();
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    int num_people = scan.nextInt();
    for(int i=0; i<num_people; i++)
    {
      String first = scan.next();
      String last = scan.next();
        int items = scan.nextInt();
        Set<String> fruits = new HashSet<String>();
        for(int j=0; j<items; j++)
        {
            int num_fruit = scan.nextInt();
            String fruit = scan.next();
            fruits.add(fruit);
            number.put(fruit, number.getOrDefault(fruit, 0) + num_fruit);
        }
        for(String fruit: fruits)
        {
          people.put(fruit, people.getOrDefault(fruit,0) + 1);
        }
    }
    //maps people as key and number of orders as values
    //iterating through second part of input to add values to keys
    
    for(int i=0; i<order.length; i++)
    {
      int people_ = people.getOrDefault(order[i], 0);
      int num = number.getOrDefault(order[i], 0);
      if(people_ != 0)
      {
        System.out.println(people_ + " customers bought " + num + " " + order[i]);
      }
      else
      {
        System.out.println("No customers bought " + order[i]);
      }
      //updates hashmap
      //checks output and outputs desired statement
    }
  }
}