#include<iostream>
using namespace std;
bool rev(int num)
{
int r,sum=0,temp;
temp=num;
while(num>0)
{
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
	
}
if(temp==sum)
{
	return true;
}
else
{
	return false;
}
}

int main()
{
int n;
cout<<"Enter no:"<<endl;
cin>>n;
bool res=rev(n);
if(res)
{
	cout<<"True";
}
else
cout<<"False";
//cout<<res;
return 0;
}


