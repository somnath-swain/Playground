#include<iostream>
using namespace std;
int main()
{
  int x,i,result=0;
  cin>>x;
  for(i=x-1;i>0;i--)
  {
    result=result+i;
  }
  cout<<result;

}