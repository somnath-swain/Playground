#include<iostream>
using namespace std;
int main()
{
  int x,y,a,b,c;
  cin>>x;
  cin>>y;
  a=x-3;
  b=y-4;
  if(a>b)
    c=a;
  if(b>a)
    c=b;
  cout<<c;
  return 0;
}
 