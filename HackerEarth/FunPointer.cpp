#include<iostream>
#include<cstring>
using namespace std;

int main()
{
	char s[10];
	
	//printf("%s",s);
	
	char *fun()
	s=fun();
	
	printf("%s",s);	
}


char *fun()
{
	
	char buffer[38];
	
	strcpy(buffer,"Shubham7");
	return buffer;
}
