#include<iostream>
using namespace std;
int main()
{ int x,y,z,i,j,odd=0,even=0;
 cin>>x;
  while(x>0)
  {
    j=x%10;
    if(j%2==0)
      even=even+j;
    else
      odd=odd+j;
    x=x/10;
  }
 if(odd==even)
   cout<<"Yes";
 else
   cout<<"No";
 return 0;
   
}