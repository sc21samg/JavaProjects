import java.util.Scanner;


public class Weight{
    public static void main(String[] args){
        System.out.print("Enter weight in kilograms: ");
 
        Scanner input = new Scanner(System.in);
        double weightKg = input.nextDouble();

        double poundsTotal = weightKg * 2.205;
        int pounds = (int)poundsTotal;
        
        double ounces = (poundsTotal - pounds) * 16 ;

        System.out.printf("Equivalent imperial weight is %d lb %.1f oz\n", pounds, ounces);

    }
}