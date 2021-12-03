package com.th.ipack;
 
public class Item  implements Comparable<Item>{
    private int id;
    private String name;
    public Item(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Item i) {
        if (id<i.id)
        return 1;
        else
            if (id==i.id)
                return 0;
            else 
                 return -1;
    }
 
}