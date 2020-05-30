#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int i=0;
  do
  {
    x=x/10;
    i++;
  }
while(x!=0);
  cout<<i;

}