#include<iostream>
using namespace std;
int main()
{
 int x,y,i,j,k;
  float result=0;
  j=3;
 for(i=0;i<j;i++)
 {
   cin>>x;
   if(x>0)
   {
   	if(x%2==1)
       {  
     
       result=result+1;
       }
    else if(x%2==0)
       {
      
         result=result-0.5;
         j++;
       }
   }
   else 
   { 
     
   result=result-1;
   break;
   }
   
 }
  cout<<result;
  return 0;
}