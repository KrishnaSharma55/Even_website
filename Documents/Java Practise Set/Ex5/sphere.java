package com.codewithharry.shape;
public class sphere extends shape{
    public sphere(float dim1)
    {
        super(dim1,-1);
    }
   public float SurfaceArea()
    {
        return (float) (4*Math.PI*Math.pow(dim1,2));
    }
    public float Volume()
    {
        return (float) ((4f/3)*Math.PI*Math.pow(dim1,3));
    }

}