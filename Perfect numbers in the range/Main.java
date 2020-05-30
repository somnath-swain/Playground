#include<iostream>
using namespace std;
int main()
{
int x,y,i,j,result;
  cin>>x;
  cin>>y;
  for(i=x;i<y;i++)
  { result=0;
		for(j=1;j<i;j++)
        {
			if(i%j==0)
            {
              result=result+j;
            }
        }
    if(result==i)
      cout<<i<<" ";
  }
          
  return 0;
}