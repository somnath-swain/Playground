#include<iostream>
using namespace std;
int main()
{
int x,y,i,j,result=0;
  cin>>x;
  cin>>y;
  j=x+y;
  for(i=1;i<j;i++)
  {
    if(j%i==0)
      result=result+i;
  }
  if (result==j)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}
