#include <iostream>
using namespace std;
int main() 
{
	int x,rem,j=1;;
 
  cin>>x;
  while(x!= 0)
  {rem=x%10;
    cout<<rem;
   x=x/10;
  }
  
	return 0;
}