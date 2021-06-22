package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
   class GFG
{

     

static int ways(int n)
{

   

    if (n == 1) 

    {

        return 1;

    }

     

   

    if (n == 2) 

    {

        return 2;

    }

    else

    {

        return ways(n - 1) + ways(n - 2);

    }
}
 

public static void main (String[] args) 
{

    int n = 5;

     

    System.out.println("Number of ways = " + ways(n));
}
}
  }

}
