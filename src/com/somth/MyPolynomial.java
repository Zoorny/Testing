package com.somth;

import java.util.Arrays;

public class MyPolynomial {

    private double coeffs[];

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i=coeffs.length - 1; i>0; i--){
            if (i > 1)
                str += coeffs[i] + "x^" + i + " + ";
            else
                str += coeffs[i] + "x" + " + ";
        }
        str +=  coeffs[0];
        return str;
    }

    public double evaluate(double x){
        double result = 0;
        for (int i=coeffs.length - 1; i>-1; i--){
            result += coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int size = (coeffs.length > right.coeffs.length) ? coeffs.length : right.coeffs.length;
        double arr[] = new double[size];
        if (coeffs.length > right.coeffs.length) {
            System.arraycopy(coeffs, 0, arr, 0, size);
            for (int i = 0; i < right.coeffs.length; i++){
                arr[i] += right.coeffs[i];
            }
        }
        else {
            System.arraycopy(right.coeffs, 0, arr, 0, size);
            for (int i = 0; i < coeffs.length; i++){
                arr[i] += coeffs[i];
            }
        }
        return new MyPolynomial(arr);
    }

    public MyPolynomial multiple(MyPolynomial right){
        int size = right.coeffs.length + coeffs.length - 1;
        double arr[] = new double[size];
        for (int i = 0; i < coeffs.length; i++ ){
            for (int j = 0; j < right.coeffs.length; j++ ) {
                arr[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(arr);
    }

}
