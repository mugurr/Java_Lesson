package model;

public class Product {
    private String name;
    private int position;
    private int count;

    public Product(String name, int position, int count) {
        this.name = name;
        this.position = position;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addOne() {
        this.count++;
    }

    public void removeOne() {
        if (this.count>0) {
            this.count--;
        }

    }
}
