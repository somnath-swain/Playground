#include<iostream>
using namespace std;
int main()
{
int arr[2];
  int f1,f2,i,j,temp;
	for(i=0;i<=2;i++)
    {
		cin>>arr[i];
    }
  for(i=0;i<=2;i++)
  {
    for(j=i+1;j<=2;j++)
    {
 		if (arr[i]>arr[j])
        {
         temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
    }
  }
    cout<<"The treasure is in box which has number "<<arr[1]<<"\n";
  for(i=arr[0];i>=1;i--)
  {
    if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0)
    {
		cout<<"The code to open the box is "<<i;
      break;
    }
  }
}
			
  