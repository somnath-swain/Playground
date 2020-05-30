#include<iostream>
using namespace std;
int main()
{
  int x,y,a,b,i,d,c;
  cin>>x>>y>>a>>b;
  d=x+a;
  c=y+b;
  if(c>=100)
  { i=c/100;
    d=d+i;
   c=c%100;}
  cout<<d<<endl;
  cout<<c;
  return 0;
}