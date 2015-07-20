package com.netcracker.edu.java.tasks;

import java.util.Arrays;
/**
 * Created by Frankie Po on 09.07.2015.
 */
public class ComplexNumberImpl implements ComplexNumber{
    private double re = 0.0;
    private double im = 0.0;

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
        if (im == 0.0)
            return true;
        else return false;
    }

    @Override
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(String value) throws NumberFormatException {

    }

    @Override
    public ComplexNumber copy() {
        ComplexNumber other = new ComplexNumberImpl();
        other.set (this.getRe(), this.getIm());
        return other;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        return (ComplexNumber) (super.clone());
    }

    @Override
    public String toString() {
        if (re == 0.0){
            if (im == 0.0)
                return "0";
            else
                return String.format("%fi", im);
        }
        else if (im == 0.0) {
            return String.format("%f", re);
        }
        else return String.format("%f%fi", re, im);
    }

    @Override
    public int compareTo(ComplexNumber other) {
        double squareAbsoluteDifference = this.getRe()*this.getRe() - this.getIm() * this.getIm() -
                other.getRe()*getRe() + getIm() * getIm();
        return (int)squareAbsoluteDifference;
    }

    @Override
    public void sort(ComplexNumber[] array) {
        Arrays.sort(array);
    }

    @Override
    public ComplexNumber negate() {
        this.set(-1.0*this.getRe(), -1.0*this.getIm());
        return this;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        this.set(arg2.getRe() + this.getRe(), arg2.getIm() + this.getIm());
        return this;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        this.set(arg2.getRe() * this.getRe() - arg2.getIm() * this.getIm(), this.getIm() * arg2.getRe() - this.getRe() * arg2.getIm());
        return this;
    }
}
