package com.codewithharry.shape;
public class cylinder extends shape{
    public cylinder(float dim1,float dim2)
    {
        super(dim1,dim2);
    }
   
    public float area()
    {
        return (float) (2*Math.PI*dim1*dim2+2*Math.PI*Math.pow(dim1,2));
    }
    public float Volume()
    {
        return (float) (Math.PI*Math.pow(dim1,2)*dim2);
    }
}