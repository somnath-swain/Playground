#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit;
  cin>>w;
  cin>>x;
  cin>>y;
  profit=(w*(x-y)-100);
  cout<<profit;
  return 0;
}