#include<iostream>
using namespace std;
int main()
{
  int flip[2],snap[2],ama[2],i,j,k;
  for(i=0;i<3;i++)
    cin>>flip[i];
   for(i=0;i<3;i++)
    cin>>snap[i]; 
  for(i=0;i<3;i++)
    cin>>ama[i]; 
 
  flip[0]=flip[0]-((flip[1]*flip[0])/100) +flip[2];
   ama[0]=ama[0]-((ama[1]*ama[0])/100) +ama[2]; 
  snap[0]=snap[0]-((snap[1]*snap[0])/100) +snap[2];
  cout<<"In Flipkart Rs."<<flip[0]<<endl;
  cout<<"In Snapdeal Rs."<<snap[0]<<endl;
  cout<<"In Amazon Rs."<<ama[0]<<endl;
  if(flip[0]<=snap[0] && flip[0]<=ama[0])
    cout<<"He will prefer Flipkart";
  if(snap[0]<flip[0] && snap[0]<ama[0])
  cout<<"He will prefer Snapdeal";
   if(ama[0]<flip[0] && ama[0]<snap[0])
  cout<<"He will prefer Amazon";
  return 0;
  
}