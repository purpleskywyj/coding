package cracking_test;

public class cracking_test {
	public static void replaceSpace(char[] s , int length)
	{
		int spaceCount = 0, newlength;
		for(int i=0;i<length;i++)
		{
			if(s[i]==' ') spaceCount++;
		}
		newlength= length + spaceCount*2;
		s[newlength]='\0';
		for(int j=length-1;j>=0;j--)
		{
			if(s[j]==' ') 
			{
				s[newlength-1]='0';
				s[newlength-2]='2';
				s[newlength-3]='%';
				newlength = newlength-3;
			}
			else
			{
				s[newlength-1]=s[j];
				newlength--;
			}
		}
	}

	
	public static void main(String[] args)
	{
		String s="a bcd\0";
		char[] t= s.toCharArray();
		replaceSpace(t, 5);
		//int j=0;
		for(char p: t)
		{
			System.out.println(p);
			//j++;
		}
		//System.out.println(j);
	}
}
