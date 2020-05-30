#include<iostream>
using namespace std;
int main()
{
  int x,y,z,first_start,first_end,last_start,last_end;
  cin>>x;
  cin>>y;
  cin>>z;
  first_start=x;
  first_end=x*2;
  last_start=x*(y-2);
  last_end=x*(y-1);

  if (z<=first_end&&z>=first_start)
    cout<<"It is a mango tree";
  else if(z>=last_start&&z<=last_end)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
   return 0;

  
}