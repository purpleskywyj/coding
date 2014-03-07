package cracking_test;

public class cracking_test {
	
	public static String compressNoStringBuffer(String str)
	{
		if(str.length() < sizeofcompress(str)) return str;
		String mystr = "";
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1 ;i < str.length();i++)
		{
			if(str.charAt(i) == last) count++;
			else
			{
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}
		return mystr += last + "" + count;
	}

	public static int sizeofcompress(String str)
	{
		int size=0;
		char last = str.charAt(0);
		int count=1;
		for(int i=1; i<str.length();i++)
		{
			if(str.charAt(i) == last) count++;
			else {
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count=1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

	
	public static void main(String[] args)
	{
		String str = "abcde";
		String t = compressNoStringBuffer(str);
		System.out.println(t);
	}
}
