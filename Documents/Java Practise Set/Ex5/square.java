package com.codewithharry.shape;
public class square extends shape{
    public square(float dim1)
    {
        super(dim1,-1);
    }
   
    public float perimeter()
    {
        return 4*(dim1);
    }
    public float area()
    {
        return dim1*dim1;
    }
}