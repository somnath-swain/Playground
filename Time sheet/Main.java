#include<iostream>
using namespace std;
int main()
{
 int arr[6];
  int i,tot_work,sunday,saturday,overtime=0,payment=0,final_payment;
 for(i=0;i<=6;i++)
 {
   cin>>arr[i];
 }
  for(i=0;i<7;i++)
  { 
	if (arr[i]>8)
    {
      overtime=(arr[i]-8)+overtime;
    }
  }
  sunday=arr[0];
    saturday=arr[6];
  
   for(i=0;i<7;i++)
  { 
	payment=arr[i]*100 +payment;
  }
  
  final_payment=payment+overtime*15 +(25)*saturday+(50)*sunday;
  cout<<final_payment;
}