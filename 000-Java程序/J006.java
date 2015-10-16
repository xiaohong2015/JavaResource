public class J006
{
	public static void main( String[] args )
	{
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println( i1.equals( i2 ) );

		Mao m1 = new Mao( "A" );
		Mao m2 = new Mao( "A " );
		System.out.println( m1.equals( m2 ) );
	}
}

class Mao
{
	String str;
	Mao( String str )
	{
		this.str = str;
	}
}
