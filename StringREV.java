import java.util.*;
class StringREV
{
	public static void main(String[] args)
	{
		String s = "BCDOEF";
		char[] arr = s.toCharArray();
		char[] sorted = new char[arr.length];
		int j=0;
		for(int i=arr.length-1; i>0; i--)
		{
			sorted[j] = arr[i];
			j++;
		}
		String result = Arrays.toString(sorted);
		System.out.print("Desending Order : "+result);
	}
}