package comp1721.cwk1;

import java.lang.String;

import java.io.IOException;

public class Game {

  private int gameNumber;

  private String target;

  // TODO: Implement constructor with String parameter

  public Game(String filename)
  throws IOException {


    WordList myworlist = new WordList(filename);

  }

  // TODO: Implement constructor with int and String parameters

  public Game(int num, String filename){

  }

  // TODO: Implement play() method

  public void play(){

  }

  // TODO: Implement save() method, with a String parameter

  public void save(String filename){

  }
}
