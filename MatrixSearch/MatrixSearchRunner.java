import java.util.*;
import java.io.*;

public class MatrixSearchRunner
{
    public static void main(String[] args) throws Exception
    {
    	  MatrixSearch ms = new MatrixSearch(5, 5, 15);
    	  System.out.println(ms);
        System.out.println( "Odd count = " + ms.countOdds() );
        System.out.println( "Even count = " + ms.countEvens() );
        System.out.println( "Prime count = " + ms.countPrimes() );
        //call count evens
    }
}
