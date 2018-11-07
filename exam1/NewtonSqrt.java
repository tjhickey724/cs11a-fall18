class NewtonSqrt {
  public static void main(String[] args) {
    System.out.print("Enter a positive number: ");
    double x=TextIO.getlnDouble();
    int e = Math.getExponent(x);
    int f = 2*(e/2);
    double y = Math.scalb(x,-f);
    double z = y;
    for(int i=0;i<10;i++){
      z = (z + y/z)/2.0;
      System.out.printf("step %d ** z=%30.20f%n",i,z);
    }
    double w = Math.scalb(z,f/2);
    System.out.printf("The square root of %f as computed by Newtons method is %n%.20f%n",x,w);
    double v = Math.sqrt(x);
    System.out.printf("The square root calculated by Math.sqrt is %n%.20f%n",v);
    System.out.printf("%n%n%nHere are the values of the variables ...%n");
    System.out.printf("x=%.20g%n",x);
    System.out.printf("e=%d%n",e);
    System.out.printf("f=%d%n",f);
    System.out.printf("y=%30.20f%n",y);
    System.out.printf("z=%30.20f%n",z);
    System.out.printf("w=%.20g%n",w);
    System.out.printf("v=%.20g%n",v);
    System.out.printf("w-v=%.20g%n",w-v);


  }
}
