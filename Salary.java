
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public void calculateNetPay(int hours,double wage){
        double salary=hours*wage;
        double deductions = salary* 0.30;
        double netPay= salary - deductions;
        System.out.println("salary:" + salary + "$");
        System.out.println("Net Pay : $" + netPay);
    }
}
