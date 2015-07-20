package ru.ncedu.java.tasks;

/**
 * ���� ������ - ����������� � �������� ��������-���������������� ���������������� � Java,
 * ���������� ��������� ������, ���������� ������� get/set, ��������� � ����� � ������� ��������.
 *
 * �������
 * ����������� �����, �������������� ����� �������� ���������� �������� (Employee).
 *
 * ����������
 * ��������� ������, ������������ ������ ���������, ������ ��������������� ������ ����������.
 * ���������� ����������� ������ get/set ��� ����� (� �������), ������� �����, �������� ����������,
 *  � ����� ��� ����������������� ��������� � �������� (������ ������������) ���������.
 * ������ (����) ������ ���� ��������� ��� private-���������� ������. 
 * ������ get** / set** ������ ����������� � ����� ������.
 * ����� ������������� ������ ���� ����������� ��� ���������� (default constructor), ������ public.
 * ����� ������ �������� ��������� ����� ������ ������ ������������ � ��� ������ set-������(-��).
 * �� ��������� (� ������ ��� ���������� ����������) �������� ������ ���� ����� 1000.
 *
 * ����������
 * ������ ����� ������ ��� ����� ��������� � ��������� �������������� �������� (Exceptions).
 * ��� ��� ������ ��������� ���������� ������� ����������:
 * public class public class EmployeeImpl implements Employee {  }
 *
 * @author Alexander Kharichkin
 * @author Yuriy Popov
 */
public interface Employee {
    /**
     * @return �������� ���������� �� ��������� ������.
     */
    int getSalary();

    /**
     * ����������� �������� ���������� �� �������� ��������
     * @param value ��������, �� ������� ����� ���������
     */
    public void increaseSalary(int value);

    /**
     * @return ��� ����������
     */
    public String getFirstName();

    /**
     * ������������� ��� ����������
     * @param firstName ����� ���
     */
    public void setFirstName(String firstName);

    /**
     * @return ������� ����������
     */
    public String getLastName();

    /**
     * ������������� ������� ����������
     * @param lastName ����� �������
     */
    public void setLastName(String lastName);

    /**
     * @return ��� � ������� ����������, ����������� �������� " " (������)
     */
    public String getFullName();

    /**
     * ������������� ��������� ����������.
     * @param manager ���������, ���������� ���������� ������� ����������.
     * �� ������� ������������, ��� �������� �������� ����������� ������ EmployeeImpl.
     */
    public void setManager(Employee manager);

    /**
     * @return ��� � ������� ���������, ����������� �������� " " (������).
     * ���� �������� �� �����, ���������� ������ "No manager".
     */
    public String getManagerName();

    /**
     * ���������� ��������� �������� ������, �.�. ������� �������� �����������,
     *   � ������� ������ ������ ���������.
     * ���� ��� ������ ����������� ��� �� ������ ���������, ���������� ������� ����������.
     * ���������: ��������� ��������, ������������� ������� {@link #setManager(Employee)},
     *   ����� ���� ���������� ������� ������, ��� ������ ���-��������� ������ ����������
     *   � ���� ������ EmployeeImpl. ����� ����, ��������� � ���������� Employee �� ���������
     *   ������ getManager(), ����� ���-��������� ���������� ������������ � ���� �����.
     *   ������ ����� ����� ������������ �������� (� ��� "����� ��������-��������������").
     */
    public Employee getTopManager();
}