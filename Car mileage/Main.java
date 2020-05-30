#include<iostream>
using namespace std;
int main()
{
  float x,y,z;
  cin>>x;
  cin>>y;
  cin>>z;
  if(z>=(x*y))
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
  return 0;
}