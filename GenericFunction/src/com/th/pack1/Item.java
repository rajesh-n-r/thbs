package com.th.pack1;
 
public class Item  implements Comparable<Item>{
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getPrice() {
        return price;
    }
 
    @Override
    public int compareTo(Item i) {
        if (price<i.price)
            return 1;
        else
            if (price==i.price)
                return 0;
            else
                return -1;
    }


 
}