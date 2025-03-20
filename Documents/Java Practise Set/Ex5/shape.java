package com.codewithharry.shape;
public class shape{
    float dim1,dim2;
    public shape(float dim1,float dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public float get_dim1(){
        return this.dim1;
    }
    public float get_dim2(){
        return this.dim2;
    }
    public void set_dim1(float dim1){
        this.dim1=dim1;
    }
    public void set_dim2(float dim2){
        this.dim2=dim2;
    }
}