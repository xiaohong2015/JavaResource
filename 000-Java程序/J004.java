public class J004
{
	public static void main( String args[] )
	{
		int i, temp;
		
		i = 1;
		while( i <= 9 )
		{
			temp = 1;
			while( temp <= i )
			{
				System.out.print( temp + "*" + i + " " );
				temp++;
			}
			System.out.println("\n");
			i++;
		}
		
		int j, k;
		
		for( j = 1; j <= 10; j++ )
		{
			temp = 10 - j;
			while( temp-- != 0 )
			{
				System.out.print(" ");
			}
			
			System.out.print( j );
			temp = j;
			while( temp != 1 )
			{
				System.out.print( --temp ); 
			}
			while( temp != j )
			{
				System.out.print( ++temp );
			}
			System.out.print("\n");
		}
		
		bike B = new bike();
		B.fun();
	}
}