#include<iostream>
using namespace std;
int main()
{
 int x,y,i,j,result=0;
  cin>>x;
  y=x;
  do{
    i=y%10;
    result=result+i;
    y=y/10;
  }while(y>0);
  if(x%result==0)
    cout<<"Harshad Number";
    else
      cout<<"Not Harshad Number";
      
  return 0;
}