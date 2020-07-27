#include<iostream>
using namespace std;


int main()
{
int i=20;
register static int *a=&i;
cout<<*a;
return 0;
}

