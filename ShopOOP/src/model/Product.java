package model;

public class Product {
    private final String name;
    private final int position;
    private final int count;

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

    public void addOne() {
        this.count++;
    }

    public void removeOne() {
        if (this.count>0) {
            this.count--;
        }

    }
}
