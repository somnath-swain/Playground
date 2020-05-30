#include<iostream>
using namespace std;
int main()
{
  int number,x,y,z;
  cin>>number;
  x=number/1000;
  y=((number%1000)%100)%10;
    z=x+y;
  cout<<z;
}