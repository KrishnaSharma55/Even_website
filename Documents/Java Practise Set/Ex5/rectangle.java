package com.codewithharry.shape;
public class rectangle extends shape{
    public rectangle(float dim1,float dim2)
    {
        super(dim1,dim2);
    }
   
    public float perimeter()
    {
        return 2*(dim1+dim2);
    }
    public float area()
    {
        return dim1*dim2;
    }
}