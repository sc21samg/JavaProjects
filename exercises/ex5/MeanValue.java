public class MeanValue {
  public static double meanValue(double[] data) {

      double sumData = 0;
      for(int i = 0; i <= j; i++){

              sumData = sumData + data[i];
              
        }
      return sumData/(j+1);
  }
static int j;
  public static void main(String[] args) {

         double[] data = new double[args.length];

          for(int i = 0; i < args.length; i++){

              data[i] = Double.parseDouble(args[i]);

              j = i;
              
        }


        if(args.length == 0){

          System.err.println("Usage: java MeanValue <values...>");
          System.exit(1);

        }
        else{
          double arithmeticMean = meanValue( data);
          System.out.printf("Mean value = %.3f\n", arithmeticMean);
        }

  }
}
