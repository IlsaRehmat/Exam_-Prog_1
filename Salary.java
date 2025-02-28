
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public void calculateNetPay(int hours,int wage){
        int salary=hours*wage;
        int netPay=(int)(salary*0.3);
        System.out.println("Net Pay : $" + netPay);
    }
}
