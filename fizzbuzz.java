/*
  From 1 to 100, print "Fizz" when the number is
  divisible by 3, print "Buzz" when the number is
  divisible by 5, print "FizzBuzz" when the
  number is divisible by 3 and 5
*/

public Class FizzBuzz{
    public static void main (String args[]){
        for(int a = 1; a <= 100; a++){
            if ((a%3==1) && (a%5==1)){
                System.out.println("FizzBuzz");
            }else{
                if(a%3==1){
                    System.out.println("Fizz");
                }
                if(a%5==1){
                    System.out.println("Buzz");
                }
            }
        }
    }
}
