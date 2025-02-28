
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025;
    public int checkDriving(int birthYear){
        int age = 2025-birthYear;
        System.out.println("Age:"+ age);
        if(age >= 16){
            System.out.println("You can drive!");
        }
        else{
           System.out.println("Wait"+(16-age)+ "years to drive");
        }
        return age;
}
}
