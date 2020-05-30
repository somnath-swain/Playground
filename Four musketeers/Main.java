#include<iostream>
using namespace std;
int main()
{
  int x[2],y[2],i,a=0,b=0;
  float f,g;
 
  for(i=0;i<3;i++)
  {
	cin>>x[i]>>y[i];
  }
  
 for(i=0;i<3;i++)
  {
a=x[i]+a;
   b=y[i]+b;
  }
 
  f=a/3.00;
  g=b/3.00;
cout<<f<<"\n";
  cout<<g;
  return 0;
}