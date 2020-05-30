#include<iostream>
using namespace std;
int main()
{
int x,y,z,i,j,k;
  cin>>x;
  for(i=1;i<=4;i++)
  {for(j=1;j<=i;j++)
  {
    cout<<x;
   
  }
   x=x+1;
   cout<<endl;
  }
  x=x-1;
   for(i=1;i<=4;i++)
  {for(j=4;j>=i;j--)
  {
    cout<<x;
   
  }
   x=x-1;
   cout<<endl;
  }
  return 0;
}