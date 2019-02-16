package com.fullstackdeveloper;

public class Vehicle
{
    private String name;
    private String size;
    private int currentvelocity;
    private int currentdirection;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentvelocity = 0;
        this.currentdirection = 0;
    }

    public void steer(int direction)
    {
        this.currentdirection += direction;
        System.out.println("Direction changed to " + this.currentdirection+"Degrees");
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void move(int velocity, int direction)
    {
        this.currentvelocity = velocity;
        this.currentdirection=direction;
        System.out.println("Current velocity is, "+ this.currentvelocity+"in direction"+ this.currentdirection );
    }
    public void stop()
    {
        this.currentvelocity=0;
    }
}
