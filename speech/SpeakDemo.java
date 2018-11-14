/**
* SpeakDemo allows you to add speech to your app
* This code is taken from this github repo
*   https://github.com/alex0107/Java-GoogleTTS
* It makes a call to the Google Speech API
* Usage: run this using this command:
*  java -cp ".:SimpleTTS.jar" SpeakDemo "I can say Hello World"
* You can add speech anywhere in your app by just invoking
*   SimpleTTS.say("some string goes here!");
*/
import java.util.Scanner;

public class SpeakDemo{
  public static void main(String[] args){

    SimpleTTS.say("Please enter your name:");
    System.out.println("> ");
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    SimpleTTS.say("Your name is "+s+ ". Do you want to hear some Japanese?");
    System.out.print("(yes or no)> ");
    String reply = input.next();
    if (reply.equals("yes")) {
      sayHelloInJapanese();
    }
  }

  public static void sayHelloInJapanese() {
    String[] data2 = {"JA","こにちわ"};
    SimpleTTS.main(data2);
  }
}
