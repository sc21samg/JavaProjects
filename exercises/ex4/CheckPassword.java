public class CheckPassword {
  public static boolean longEnough(String password) {

      if(password.length() >= 12){ 
          
          return true;
          }
      else{
          System.out.println("Password is not valid");
    
          return false;
      }
  }

  public static boolean atLeastTwoDigits(String password) {

      int cont = 0;
      for(int i = 0; i < password.length(); i++){
          Boolean flag = Character.isDigit(password.charAt(i));
          if(flag){
              cont++;
          }
      }
      if(cont == 2)
        return true;
      else{
          System.out.println("Password is not valid");
          return false;
      }
  }

  public static void main(String[] args) {

      if(args.length == 0){
          System.err.println("Usage: java CheckPassword <password>");
          System.exit(1);
          }
          else{


            String password = args[0];
        

          if(longEnough(password) && atLeastTwoDigits(password)){
          System.out.println("Password is valid");
          }
          else
            System.exit(1); 

      }
  }
}