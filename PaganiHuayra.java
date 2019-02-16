package com.fullstackdeveloper;

public class PaganiHuayra extends Car
{
    private int roadservicemonths;

    public PaganiHuayra(int roadservicemonths)
    {
        super("PaganiHuayra","4WD",4, 5,6 , false);
        this.roadservicemonths = roadservicemonths;
    }
    public void accelerate(int rate)
    {
        int newvelocity= this.getCurrentvelocity()+ rate;
        if(newvelocity == 0) {
            stop();
            changegear(1);
        }
        else if(newvelocity> 0 && newvelocity<10)
        {
            changegear(1);
        }
        else if(newvelocity>10 && newvelocity <=20)
        {
                 changegear(2);
        }
        else if(newvelocity>20 && newvelocity <=30)
        {
            changegear(3);
        }
        else
        {
            changegear(4);
        }
        if(newvelocity >0)
        {
            changevelocity(newvelocity,getCurrentdirection());
        }
    }
}
