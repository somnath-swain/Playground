#include<iostream>
using namespace std;
int main()
{
 int x,y,result=0;
  cin>>x;
  cout<<x<<endl;
  if(x>1)
  {
  do{
    if(x%2==0)
    { x=x/2;
    cout<<x<<endl;
     result++;
    }
    else
    {
      x=3*x+1;
      cout<<x<<endl;
      result++;
    }
  }
  while(x>1);
  }
  cout<<result;
  return 0;
}
  