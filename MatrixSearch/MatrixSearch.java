import java.util.*;
import java.util.Random;
import java.io.*;

public class MatrixSearch
{
    private int[][] mat;

		/*
		 *pre - mat is null
		 *post - mat will be rows X cols
		 *post - mat will contain integers that are <= upper and >= 1
		 */
    public MatrixSearch( int rows, int cols, int upper )
    {
    	Random randy = new Random();
    	mat = new int[rows][cols];
    	for(int i=0;i<rows;i++)
    	{
    		for(int i3=0;i3<cols;i3++)
    		{
    			mat[i][i3]= randy.nextInt(upper)+1;
    		}
    	}
    }


		/*
		 *pre - mat is not null
		 *post - count of odd numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countOdds( )
    {
		int num=0;
		for(int i=0;i<mat.length;i++)
    	{
    		for(int i3=0;i3<mat[i].length;i3++)
    		{
    			if(mat[i][i3]%2==1)
    			{
    				num++;
    			}
    		}
    	}
    	return num;
    }


		/*
		 *pre - mat is not null
		 *post - count of even numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countEvens( )
    {
		int num=0;
		for(int i=0;i<mat.length;i++)
    	{
    		for(int i3=0;i3<mat[i].length;i3++)
    		{
    			if(mat[i][i3]%2==0)
    			{
    				num++;
    			}
    		}
    	}
    	return num;
    }


		/*
		 *pre - mat is not null
		 *post - count of prime numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countPrimes( )
    {
		int num=0;
		for(int i=0;i<mat.length;i++)
    	{
    		for(int i3=0;i3<mat[i].length;i3++)
    		{
    			if(isPrime(mat[i][i3]))
    			{
    				num++;
    			}
    		}
    	}
    	return num;
    }

		/*
		 *pre - num has a value
		 *post - false is returned if num is divisble by any number between 2 and itself
		 *post - true is returned if num is not divisble by any number between 2 and itself
		 */
    private boolean isPrime( int num )
    {
    	for(int i=2;i<num;i++)
    	{
    		if(num%i==0)
    		{
    			return true;
    		}
    	}
    	return false;
    }

		/*
		 *pre - mat is not null
		 *post - all values from mat are concatenated to a string and returned
		 */
    public String toString()
    {
    	String s="";
    	for(int i=0;i<mat.length;i++)
    	{
    		for(int i3=0;i3<mat[i].length;i3++)
    		{
    			int num = mat[i][i3];
    			s+= "   "; //3 spaces

    			for(int i5=0; i5<(""+num).length() && i5<3; i5++)
    			{
    				s+="\b";
    			}
    			s+=num;

    		}
    		s+="\n";

    	}
    	return s;
    }
}
