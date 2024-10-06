package thuchanh.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenize extends XuLyChuoi{

  @Override
  ArrayList<String> tachChuoi() {
    String[] wordsArray = str.split("(?=[ .,])|(?<=[ .,])");

    return new ArrayList<>(Arrays.asList(wordsArray));
  }
}
