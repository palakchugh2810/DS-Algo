package Amdocs;

public class BitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static byte bitCount(byte n)
	{
		byte count;
		for(count=0; n!=0; n++)
		{
			n &= (n-1);
		}
		return n;
	}
}
