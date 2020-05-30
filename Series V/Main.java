#include<iostream>
using namespace std;
int main()
{
  int i,j,k,x,y,z;
  cin>>x;
  z=121;
  j=104;
  for(i=0;i<x;i++)
  { cout<<z<<" ";
    z=z+j;
    j=j+32;
    
  }
  return 0;
}