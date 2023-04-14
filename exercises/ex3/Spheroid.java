import java.util.Scanner;
import java.lang.Math;

class Spheroid{
    public static void main(String[] args){
        System.out.print("Enter equatorial radius in km: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        if(a <= 0)
        {
            System.out.println("Error: equatorial radius must be larger than 0");
            System.exit(0);
        }

        System.out.print("Enter polar radius in km: ");
        double c = input.nextDouble();

        if(c <= 0)
        {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(0);
        }

        if(c > a)
        {
            System.out.println("Error: equatorial radius must be larger than polar radius");
            System.exit(0);
        }

        double eccentricity = Math.sqrt(1.0 - (c*c)/(a*a));

        System.out.printf("Eccentricity = %.3f\n", eccentricity);


        double volume = (4.0*Math.PI*a*a*c)/3;

        System.out.printf("Volume = %.6g cubic km\n", volume);


    }
} 