#include <iostream>
#include <string>
using namespace std;

void reverse(char *str)
{
	char* end=str;
	char tmp;
    if(str){
        while(*end){
            ++end;
        }
        --end;
        while(str<end)
        {
            tmp = *str;
            *str++ = *end;
            *end-- = tmp;
        }
    }
}
int main()
{
	char *st2="abcdfghi";
	reverse(st2);
	for(int i=0;i<9;i++)
	{
		cout<<st2[i];
	}
    return 0;
}