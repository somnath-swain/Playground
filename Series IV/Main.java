#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i,j,k;
  cin>>x;
  z=0;
 cout<<z<<" ";
  for(i=0;i<=x-2;i++)
  {  
    if(i>=0&&i<1)
  {
  z=z+2;
  }
   if(i>=1 && i<3)
   {
   z=z+6;
    
   }
    if(i>=3 && i<=4){
      z=z+10;
    }
    if(i>4 &&i<=6)
      z=z+14;
   if(i>6 &&i<=8)
     z=z+18;
   cout<<z<<" ";
    
  }
  return 0;
}