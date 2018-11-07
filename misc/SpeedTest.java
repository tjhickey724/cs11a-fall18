public class SpeedTest {
  public static void main(String[] args){
    long start = System.nanoTime();

    long n = 1;
    long max = 1_000_000_000;

    if (args.length>0) {
      max = Long.parseLong(args[0]);  // this converts the first argument to a long
    }
    System.out.println("args[0]="+args[0]+" max="+max);
    System.out.println("starting loop!");
    double maxval = max;
    System.out.println("\n\nCounting up to "+maxval);
    while (n <= max){
      n= n+1;
    }

    long stop = System.nanoTime();
    System.out.println("\n\nFinished counting up to "+maxval);

    System.out.println("done in "+ (stop-start)/1_000_000_000.0 + " sec");
    System.out.println("time per iteration of loop: "
         +1000*(stop-start)/maxval+" ps");
    System.out.println("that is "+1000*(stop-start)/max+ " trillionths of a second!");
    System.out.println("Your processor speed is about "
       + maxval/(stop-start)+" GHz");
  }
}
