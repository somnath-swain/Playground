#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i;
  cin>>x;
  y=6;
  z=0;
  for(i=1;i<=x;i++)
  {
    cout<<y<<" ";
    z=z+5;
    y=y+z;
  }
return 0;
}
