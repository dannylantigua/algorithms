/*
    A program that will tell if the number entered by the user is prime or not
*/

public Class PrimeNumber{
  public static void main(String args[]){
       for (int i = 1; i <= numberInserted; i++) {
            if (numberInserted % i == 0) {
                isPrime++;
            }
        }

        if (isPrime == 2) {
            System.out.println(numberToFactor + " is a prime number");
        }else{
            System.out.println(numberToFactor + " is NOT a prime number");
        }
  }
}
