#include<iostream>
using namespace std;
int main()
{
  int x,y,born,current,age;
  cin>>x;
  cin>>y;
  if (x>=00 && x<=20)
    born=2000+x;
  else
  born=1900+x;
 if (y>=00 && y<=50)
   current=2000+y;
  else
    current=1900+y;
  cout<<current-born;
  return 0;
}