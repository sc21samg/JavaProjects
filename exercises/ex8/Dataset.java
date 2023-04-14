import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.lang.ArithmeticException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dataset{

    private List<Double> data = new ArrayList<>();
//size() counter
    int i = -1;
//final number of the size
    int sizeLength;
//initialising the sum of all numbers in the file
    double sumNumbers = 0;

//get numbers from file into array list
    public Dataset(String filename)
        throws IOException{
            Scanner input = new Scanner(Paths.get(filename));

            while(input.hasNextDouble()){
                double data = input.nextDouble();

                sumNumbers = sumNumbers + data;
                
                sizeLength = size();
            }
            input.close();
        }


//size() method: count numbers in file
    public int size(){
        i++;
        return i;
    }
//find mean value method
    public double meanValue(){
        if(sumNumbers == 0){
        throw new ArithmeticException();

        }
        else
        return sumNumbers/((double)sizeLength + 1);        
    }

}