package ru.ncedu.java.tasks;

import java.util.Arrays;
/**
 * Created by Frankie Po on 11.07.2015.
 */
public class ArrayVectorImpl implements ArrayVector{
    private double array[];
    private int length = 0;
    @Override
    public void set(double... elements) {
        length = elements.length;
        array = new double[length];
        for(int i = 0; i <= length  - 1; i++) {
            array[i] = elements[i];
        }
    }

    @Override
    public double[] get() {
        return array;
    }

    @Override
    public ArrayVector clone(){
        ArrayVector clonedVector = new ArrayVectorImpl();
        clonedVector.set(array.clone());
        return clonedVector;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public void set(int index, double value) {
        if (index >= length) {
            array = Arrays.copyOf(array, index+1);
            length = index+1;
        }
        if (index >= 0) {
            //array[index] = value;
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }

    @Override
    public double getMax() {
        double max;
        max = array[0];
        for (int i = 0; i <= length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        double min;
        min = array[0];
        for (int i = 0; i <= length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(array);
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i <= length - 1; i++) {
            array[i] *= factor;
        }
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        int minLength;
        if (this.length > anotherVector.getSize()) {
            minLength = anotherVector.getSize();
        }
        else minLength = this.length;
        for (int i = 0; i <= minLength - 1; i++) {
            this.array[i] += anotherVector.get(i);
        }
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double scalarAns = 0.0;
        int minLength = Math.min(this.length, anotherVector.getSize());
        for (int i = 0; i <= minLength - 1; i++) {
            scalarAns += (this.array[i] * anotherVector.get(i));
        }
        return scalarAns;
    }

    @Override
    public double getNorm() {
        return Math.sqrt(this.scalarMult(this));
    }
}
