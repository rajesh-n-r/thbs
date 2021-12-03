package com.th.mainpack;
 
import java.util.PriorityQueue;
import java.util.Queue;
 
import com.th.ipack.Item;
 
public class Main {
 
    public static void main(String[] args) {
        Queue<Item> pq = new PriorityQueue<Item>();

        pq.add(new Item(154,"Java"));
        pq.add(new Item(45,"HTML"));
        pq.add(new Item(4,"C"));
        pq.add(new Item(154,"C++"));
        pq.add(new Item(60,"Java Script"));

        System.out.println("___________________________________");
        for (Item i:pq)
        {
            System.out.println(i);
        }

        System.out.println(pq.poll());
        System.out.println("___________________________________");
        for (Item i:pq)
        {
            System.out.println(i);
        }
        System.out.println(pq.poll());
        System.out.println("___________________________________");
        for (Item i:pq)
        {
            System.out.println(i);
        }
        System.out.println(pq.poll());
        System.out.println("___________________________________");
        for (Item i:pq)
        {
            System.out.println(i);
        }



 
    }
 
}