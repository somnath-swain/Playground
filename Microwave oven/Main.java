#include<iostream>
using namespace std;
int main()
{
  int x;
  float time,final;
  cin>>x;
  cin>>time;
  if (x>3)
  {
    cout<<"Number of items is more";
  }
  else if (x==2)
  {
final=(1.5)*time;
    cout<<final;
  }
   else if(x==3)
   {
	final=2*time;
     cout<<final;
   }
    
}