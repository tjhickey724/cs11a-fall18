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
public class SpeakDemo{
  public static void main(String[] args){
    String[] data = {"EN-US",args[0]};
    SimpleTTS.say(args[0]);
  }
}
