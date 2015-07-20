package ru.ncedu.java.tasks;

/**
 * Created by brisi_000 on 09.07.2015.
 */
public class ZeroTaskImpl implements ZeroTask{
    private int value = 0;
    @Override
    public void setIntegerValue(int value) {
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return value;
    }
}
