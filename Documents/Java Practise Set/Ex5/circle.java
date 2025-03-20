package com.codewithharry.shape;
public class circle extends shape{
    public circle(float dim1)
    {
        super(dim1,-1);
    }
   
    public float perimeter()
    {
        return (float)(2*Math.PI*dim1);
    }
    public float area()
    {
        return (float) (Math.PI*dim1*dim1);
    }
}