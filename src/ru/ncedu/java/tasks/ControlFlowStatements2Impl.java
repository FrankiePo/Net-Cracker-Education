package ru.ncedu.java.tasks;

/**
 * Created by Frankie Po on 16.07.2015.
 */
public class ControlFlowStatements2Impl implements ControlFlowStatements2{
    @Override
    public int getFunctionValue(int x) {
        if ( (-2 <= x) && (x <= 2) ){
            return -3*x;
        }
        else return 2*x;
    }

    @Override
    public String decodeMark(int mark) {
        String markString;
        switch (mark) {
            case 1:  markString = "Fail";
                break;
            case 2:  markString = "Poor";
                break;
            case 3:  markString = "Satisfactory";
                break;
            case 4:  markString = "Good";
                break;
            case 5:  markString = "Excellent";
                break;
            default: markString = "Error";
                break;
        }
        return markString;
    }

    @Override
    public double[][] initArray() {
        double[][] myarray = new double[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                myarray[i][j] = (double)(i*i*i*i) - Math.sqrt((double)j);
                System.out.println(myarray[i][j] + " ");
            }
        }
        return myarray;
    }

    @Override
    public double getMaxValue(double[][] array) {
        double max = array[0][0];
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public Sportsman calculateSportsman(float P) {
        Sportsman SM = new Sportsman();
        SM.addDay(10);
        while (SM.getTotalDistance() <= 200) {
            SM.addDay(SM.getTotalDistance()*P/100);
        }
        return SM;
    }
}