import java.util.Objects;

public class Circle{

    private double radius;
//overload constructor no parameters
    public Circle(){
        
        radius = 1.0;
    }
//original constructor with exception error message
    public Circle(double r){
        radius = r;
        if(radius <= 0){
            throw new IllegalArgumentException("Invalid radius");
        }
    }


//returns radius field
    public double getRadius(){   
        return radius;
    }

    public double area(){
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    public double perimeter(){
        double perimeter = 2 * radius * Math.PI;
        return perimeter;

    }
//new verion of toString() shows 4 decimals
    @Override
        public String toString(){
            return String.format("Circle(radius=%.4f)", radius);
        }
//return true if differeence between r and radius is less than 0.00005
//answer in lecture 9 part 2 :))))))))
    @Override
        public boolean equals(Object obj){
            if(obj == this){
                return true;
            }
            else if(obj instanceof Circle){
                Circle c = (Circle) obj;
             return c.radius < 1.00005 && c.radius > 0.00005;
             //radius < 1.00005 && radius >= 0.00005
            }
            else
            return false;

        }
}