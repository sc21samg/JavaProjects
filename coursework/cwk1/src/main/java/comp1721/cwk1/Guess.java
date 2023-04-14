package comp1721.cwk1;

import java.util.Scanner;
import java.lang.String;


public class Guess {
  // Use this to get player input in readFromPlayer()
  private static final Scanner INPUT = new Scanner(System.in);

  private int guessNumber;

  private String chosenWord;

  String colourCodedLetters;

  int verify = 0, lettersMatch = 0;


  public Guess(int num)
  throws GameException{     
             

    if(num < 1 || num > 6 ){
       throw new GameException("Invalid range");
    }
    else{
      guessNumber = num;
    }
    
  }


  public Guess(int num, String word)
  throws GameException{

    //check if num is in range 1-6
    if(num < 1 || num > 6 ){
       throw new GameException("Invalid range");
    }
    else{
      guessNumber = num;
    }

    
    //check word is of 5 characters
    if(word.length() == 5 && word.matches("[a-zA-Z]+")){
            chosenWord = word.toUpperCase();  
            verify = 1;
    }
    else{
      throw new GameException("Word must have 5 characters");
    }
  }


  public int getGuessNumber(){
    return guessNumber;
  }


  public String getChosenWord(){
    return chosenWord;
  }


  public void readFromPlayer(){
    if(verify == 0){
      String chosenWord = INPUT.nextLine();
    }
  }

  public String compareWith(String target){

//unfortunatly I can't use a loop as the return statement exits the method after the 1st loop

//no letter matches
      if(!chosenWord.equals(target)){
        return "\033[30;107m " + chosenWord.charAt(0) + " \033[0m" + 
        "\033[30;107m " + chosenWord.charAt(1) + " \033[0m" +
        "\033[30;107m " + chosenWord.charAt(2) + " \033[0m" +
        "\033[30;107m " + chosenWord.charAt(3) + " \033[0m" +
        "\033[30;107m " + chosenWord.charAt(4) + " \033[0m";
      }
//all letter matche
      if(chosenWord.equals(target)){
        return "\033[30;102m " + chosenWord.charAt(0) + " \033[0m" + 
        "\033[30;102m " + chosenWord.charAt(1) + " \033[0m" +
        "\033[30;102m " + chosenWord.charAt(2) + " \033[0m" +
        "\033[30;102m " + chosenWord.charAt(3) + " \033[0m" +
        "\033[30;102m " + chosenWord.charAt(4) + " \033[0m";
      }
//the string didn't work
/*
      for(int i = 0; i <= 5; i++){
        for(int j = 0; j <= 5; j++){
          if(chosenWord.charAt(i) == target.charAt(j)){
            lettersMatch = 1;
          }
          if(lettersMatch == 1){
            colourCodedLetters = "\033[30;103m " + chosenWord.charAt(i) + " \033[0m";
          }
          else{
            colourCodedLetters = "\033[30;107m " + chosenWord.charAt(i) + " \033[0m";
          }
        }
      }*/
      
      //chosenWord.charAt(i) = target.charAt(i);
    return colourCodedLetters; //String
  } 


  public boolean matches(String target){
    //checking if the word choosen by player is equal to the target
      return chosenWord.equals(target); 
  }
}
