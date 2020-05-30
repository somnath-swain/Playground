#include<iostream>
using namespace std;
int main()
{
int i=0,j,k,x,y,z,result=0,temp;
  cin>>x;
  while(result<x)
  { cin>>j;
   result=result+j;
    ++i;
  }
  cout<<"The number of turns is "<<i;
  return 0;
}