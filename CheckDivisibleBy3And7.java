class CheckDivisibleBy3And7

{
    public static void main(String args[] )
    {
    int i;
    System.out.println("The numbers which are divisible by both 3 and 7 from 1 to 100:");
    for(i = 1; i <= 100; i++)
      {
    // Condition to check divison of 3 and 7
        if((i%3) == 0 && (i%7)==0)
        System.out.println(+i);
      }
    }
}

