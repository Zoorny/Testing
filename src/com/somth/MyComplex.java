package com.somth;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag >= 0)
            return "(" +
                real +
                '+' + imag +
                "i)";
        else return "(" +
                real +
                '-' + -imag +
                "i)";
    }

    public boolean isReal(){
        return (real!= 0);
    }

    public boolean isImaginary(){
        return (imag!= 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyComplex myComplex = (MyComplex) o;

        if (Double.compare(myComplex.real, real) != 0) return false;
        return Double.compare(myComplex.imag, imag) == 0;
    }

    public boolean equals(double real, double imag) {
        MyComplex o = new MyComplex(real, imag);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyComplex myComplex = (MyComplex) o;

        if (Double.compare(myComplex.real, real) != 0) return false;
        return Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imag);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public double argument(){
        return Math.atan(imag/real);
    }

    public void add(MyComplex right){
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public void subtract(MyComplex right){
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right){
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right){
        return new MyComplex((this.real * right.real + this.imag * right.imag)/(Math.pow(right.real,2) + Math.pow(right.imag,2)), (this.imag * right.real - this.real * right.imag)/(Math.pow(right.real,2) + Math.pow(right.imag,2)));
    }

    public MyComplex conjugate(){
        return new MyComplex(this.real, -this.imag);
    }
}
