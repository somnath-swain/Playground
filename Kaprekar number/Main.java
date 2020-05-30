#include<iostream>
using namespace std;
int main()
{
int x,y,z=1,i,j,temp,num_dig=0,squ_dig=0;
  int temp2;
  int front,back,sum;
  int arr;
  cin>>x;
  temp=x;
  while(temp>0)
  {
    j=temp%10;
    num_dig++;
    temp=temp/10;
  }
  y=x*x;
  temp2=y;
  while(temp2>0)
  {
    j=temp%10;
    squ_dig++;
    temp2=temp2/10;
  }
  for(i=1;i<=num_dig;i++)
    z=10*z;
  
   back=y%z;
  front=y/z;
 sum=front+back;
   if(sum==x)
     cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
  
  return 0;
}