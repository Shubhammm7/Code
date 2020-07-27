#include<stdio.h>
int main()
{
	int data_arr[3][3]={5,7,20,200,215,400,-10,-20,-21};
	int (*data)[3][3]=&data_arr;
	printf("%d\t",***data);
	printf("%d\t",***(data+1));
	printf("%d\t",**(*data+1));
	printf("%d\t",*(*(*data+1)+4));
	return 0;
}
