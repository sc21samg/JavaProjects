package comp1721.cwk1;

import java.io.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.Iterable;
import java.lang.String;



public class WordList {

  private List<String> words = new ArrayList<>(); //List<String> List[] words
  int i = -1;
  int j = 0;
  int wordListLength;

  List<String> word = new ArrayList<>();


  //read the words from file
  public WordList(String filename)
    throws IOException{
    
      Scanner input = new Scanner(Paths.get(filename));


      while(input.hasNextLine()){
        String words = input.nextLine();

        //increment size number when word is read from file
        wordListLength = size();

        //i created another arrayList to put separately the words, 
        //and use the get(int i) method in mehod getWord(n)
        for(j = 0; j < 1; j++){
         word.add(words);
        }
      


      }
      input.close();
    
  }


  public int size(){
    i++;
    return i;
  }


  //n = game number
  //validation of provided gameNumber parameter

  public String getWord(int n) throws GameException{
    if(n >= 0 && n <= wordListLength){
      return word.get(n);

    }
    else{
      throw new GameException("Invalid parameter");
    }
  }
}
