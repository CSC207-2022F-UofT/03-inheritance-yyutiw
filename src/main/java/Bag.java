/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;

        numberOfContents = 0;
        contents = new String[capacity];
    }

    public String getColor() {
        return this.color;
    }
    public int getNumberOfContents() {
        return this.numberOfContents;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Add an item to the Bag if it is not at maximum capacity
     * @param item - the item being added
     * @return whether the item has been successfully added
     */
    public boolean addItem(String item) {
        if (this.getNumberOfContents() < this.capacity) {
            contents[this.getNumberOfContents()] = item;
            this.numberOfContents ++;
            return true;
        }
        return false;
    }
    /**
     * Remove the last item from the bag.
     * If there are no items in this Bag, return null.
     *
     * @return the last item in the Bag
     */
    public String popItem() {
        if (this.numberOfContents == 0) return null;

        String lastItem = contents[this.numberOfContents-1];
        contents[this.numberOfContents - 1] = null;
        this.numberOfContents --;
        return lastItem;
    }
    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}