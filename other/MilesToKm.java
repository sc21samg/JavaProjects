import java.util.Scanner;


public class MilesToKm{
    public static void main(String[] args){
        System.out.print("Enter distance in miles: ");
 
        Scanner input = new Scanner(System.in);
        double distanceMiles = input.nextDouble();

        double distanceKm = distanceMiles * (8.0/5);
        System.out.printf("%.1f miles = %.1f km\n", distanceMiles, distanceKm);
        //System.out.println(distanceKm);

    }
}



