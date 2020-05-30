#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i,j=0;
  cin>>x;
  
  for(i=1;i<=x;i++)
  {
    if(x%i==0)
      j++;
  }
  if(j==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
  
  return 0;
}
  