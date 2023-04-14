public class Circle{

    private double radius;

    public Circle(double r){
        
        radius = r;
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
}
