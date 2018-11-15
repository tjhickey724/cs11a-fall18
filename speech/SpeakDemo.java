/**
* SpeakDemo allows you to add speech to your app
* This code is taken from this github repo
*   https://github.com/alex0107/Java-GoogleTTS
* It makes a call to an unofficial feature of the Google Speech API
* see https://stackoverflow.com/questions/35002003/how-to-use-google-translate-tts-with-the-new-v2-api
*
* Usage: run this using this command:
*  java -cp ".:SimpleTTS.jar" SpeakDemo "I can say Hello World"
* if you make changes you need to compile with this command
*  javac -cp ".:SimpleTTS.jar" SpeakDemo.java
* You can add speech anywhere in your app by just invoking
*   SimpleTTS.say("some string goes here!");
*/
import java.util.Scanner;

public class SpeakDemo{

  public static void main(String[] args){
    String response;
    response = promptForInput("Please enter your name: ");
    SimpleTTS.say("Your name is "+response+".");
    pause(2000);

    response = promptForInput("Want to hear some typing sound?");
    if (response.equals("yes")){
      playMP3("Typing.mp3");
    }
    pause(2000);

    response = promptForInput("Do you want to hear some Japanese? (yes or no)");
    if (response.equals("yes")) {
      sayHelloInJapanese();
    }
  }

  /**
  * speak the English words in the prompt, print a "> ", read and return response
  * @param prompt the sentence that should be spoken
  * @return the string that the user enters after hearing the prompt
  */
  public static String promptForInput(String prompt){
    SimpleTTS.say(prompt);
    System.out.print("> ");
    Scanner input = new Scanner(System.in);
    String response = input.nextLine();
    return response;
  }

  /**
  * uses Google Speech API to say konichi-wa from the hiragana unicode string
  * here are the languages it recognizes
  * https://cloud.google.com/text-to-speech/docs/voices
  */
  public static void sayHelloInJapanese() {
    String[] data2 = {"JA","こにちわ"};
    SimpleTTS.main(data2);
  }

  /**
  * This will play an MP3 file.
  * This uses tje JLayer code from https://github.com/wkpark/JLayer
  */
  public static void playMP3(String filename){
    MP3 player = new MP3(filename);
    player.play();
  }

  /**
  * this pauses for a given number of milliseconds
  * @param ms the number of millisecods to pause
  */
  public static void pause(int ms){
    try{
      java.lang.Thread.sleep(ms);
    } catch (Exception e){
      System.out.println("Exception while in pause method: "+e);
    }
  }

}
