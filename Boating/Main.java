#include<iostream>
using namespace std;
int main()
{
  int man,child,boat,total;
  cin>>boat;
  cin>>man;
  cin>>child;
  total=man*75 +child*30;
  if(boat>total||boat==total)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}