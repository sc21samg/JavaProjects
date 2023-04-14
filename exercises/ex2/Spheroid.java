import java.util.Scanner;
import java.lang.Math;

class Spheroid{
    public static void main(String[] args){
        System.out.print("Enter equatorial radius in km: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.print("Enter polar radius in km: ");
        //Scanner input = new Scanner(System.in);
        double c = input.nextDouble();

        double eccentricity = Math.sqrt(1.0 - (c*c)/(a*a));

        System.out.printf("Eccentricity = %.3f\n", eccentricity);


        double volume = (4.0*Math.PI*a*a*c)/3;

        System.out.printf("Volume = %.6g cubic km\n", volume);


    }
}