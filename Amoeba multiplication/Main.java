#include<iostream>
using namespace std;
int main()
{
  int x,y,i,j,result=0,count=1,temp,z=0;
  cin>>x;
  for(i=1;i<x;++i)
  { 

  temp=result+count;
   result=count;
   count=temp;
   
    
   }
cout<<result;
  return 0;
}