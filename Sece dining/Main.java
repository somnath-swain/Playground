#include<iostream>
using namespace std;
int main()
{
  string s;
  int x;
  cin>>s;
  cin>>x;
  
  if(s=="front")
  {
	if(x==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  if(s=="rear")
  {
	if(x==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  return 0;
}