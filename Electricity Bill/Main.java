#include<iostream>
using namespace std;
int main()
{
  int x;
  float result;
  cin>>x;
  if (x<=200)
    result=x/2;
  else if (x>200 & x<=400)
    result=(0.65*x)+100;
  else if(x>400 & x<=600)
    result=(0.80*x)+ 200;
  else 
    result=(1.25*x)+425;
  cout<<"Rs."<<result;
  return 0;
}