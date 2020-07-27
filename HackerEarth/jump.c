#include<stdio.h>
int main()
{
	const int maxinput=15;
	int i;
	
	int sum=0;
	for(i=1;i<maxinput;++i)
	{
		if(i>5)
		goto jump;
		sum+=i;
		
	}
	jump:
	printf("%d",sum);
	return 0;
}
