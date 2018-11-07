/**
 Fibonacci Demo
 This program computes the first few elements of the Fibonacci sequence.
 The sequence starts with 0,1 and you get the next element by adding the
 previous 2, so it continues as 0,1,1,2,3,5,8,13,21,34,55,...
*/
public class FibonacciDemo {
  public static void main(String[] args){
    int num=20;
    if (args.length>0){
      num = Integer.parseInt(args[0]); // convert first arg to an integer
    }
    for(int i = 0; i< args.length; i++){
      System.out.printf("arg %d is '%s' %n",i,args[i]);
    }

    System.out.printf("The first %d terms of the Fibonacci sequence are:%n",num);
    int a=0;
    int b=1;
    for(int i=1; i<=num; i++){
      int temp = a+b;
      System.out.printf("%3d %d%n",i,temp);
      a=b;
      b=temp;
    }
  }
}
