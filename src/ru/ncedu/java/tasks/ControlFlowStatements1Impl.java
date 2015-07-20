package ru.ncedu.java.tasks;

/**
 * ���� ������ - ��������� ������������ ����������� ����������� <code>if, case, for, while</code> � Java.<br/>
 * �������������: ����������� � �������� ������, ��������� � ��������� ���������� � ������.<br/>
 * <p/>
 * �������<br/>
 * <dl>
 * <dt>�������� if</dt>
 * <dd>��������� �� ��� ���� ������� � ����������� �� �������. </dd>
 * <dt>�������� case</dt>
 * <dd>������� ��������� �������� � ����������� �� �������������� ��������.</dd>
 * <dt>�������� for</dt>
 * <dd>��������� � ���������� ��������� ������. </dd>
 * <dt>�������� while</dt>
 * <dd>���������� ��������� ����������� ������. </dd>
 * </dl>
 * <p/>
 * ����������<br/>
 * ������ ����� ������ ��� ����� ��������� � ��������� �������������� �������� (Exceptions).<br/>
 * ��� ��� ������ ��������� ���������� ������� ����������:<br/>
 * <code>
 * public class ControlFlowStatements1Impl implements ControlFlowStatements1 {  }
 * </code>
 * <br/>
 * ����� main �� �����������, �� ��� ���� � main �� ������ ���������, ��� ���������� ���� ������, ��������:
 * <code>
 * ControlFlowStatements1 object = new ControlFlowStatements1Impl();
 * System.out.println(object.decodeWeekday(4));
 * </code>
 * <br/>
 *  @author Elena Protsenko
 *  @author Alexey Evdokimov
 */
public class ControlFlowStatements1Impl implements ControlFlowStatements1{
    @Override
    public float getFunctionValue(float x) {
        double help = (double)x;
        if (help > 0) {
             return (float)(2*Math.sin(help));
        }
        else return (float)(6-x);
    }

    @Override
    public String decodeWeekday(int weekday) {
        String weekString;
        switch (weekday) {
            case 1:  weekString = "Monday";
                break;
            case 2:  weekString = "Tuesday";
                break;
            case 3:  weekString = "Wednesday";
                break;
            case 4:  weekString = "Thursday";
                break;
            case 5:  weekString = "Friday";
                break;
            case 6:  weekString = "Saturday";
                break;
            case 7:  weekString = "Sunday";
                break;
            default: weekString = "Invalid week";
                break;
        }
        return weekString;
    }

    @Override
    public int[][] initArray() {
        int[][] myarray = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                myarray[i][j] = i*j;
            }
        }
        return myarray;
    }

    @Override
    public int getMinValue(int[][] array) {
        int min = array[0][0];
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    @Override
    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit BD = new BankDeposit();
        BD.amount = 1000;
        BD.years = 0;
        while (BD.amount <= 5000) {
            BD.amount += BD.amount*P/100.0;
            BD.years += 1;
        }
        return BD;
    }
    public void main(String[] args) {
        // write your code here
        BankDeposit BD;
        BD = calculateBankDeposit(12.5);
        System.out.println(BD.toString());
        System.out.println("Hello, World!");
    }
}