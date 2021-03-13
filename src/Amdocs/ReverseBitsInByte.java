package Amdocs;

public class ReverseBitsInByte {

	public static void main(String[] args) {
		//reverseBitsByte()
	}
	
	public byte reverseBits(byte n) {
		  byte reversedBits=0;
		  for(int i=8-1; i>0; i--){
			  reversedBits+=((n&1)<<i);
		    n >>= 1;
		  }
		  return reversedBits;
		}

}
