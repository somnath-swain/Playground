#include<iostream>
using namespace std;
int main()
{
int x,y,z,out;
  cout<<"Enter first number : ";
  cin>>x;
  cout<<"Enter second number : ";
  cin>>y;
  cout<<"Menu \n";
  cout<<"1.Addition \n";
  cout<<"2.Subtraction \n";
  cout<<"3.Multiplication \n";
  cout<<"4.Division \n";
  cout<<"5.Remainder \n";
  cin>>z;
  switch(z){
    case 1: out=x+y; cout<<out;break;
    case 2: out=x-y; cout<<out;break;
    case 3: out=x*y; cout<<out;break;
    case 4: out=x/y; cout<<out;break;
    case 5: out=x%y; cout<<out;break;
    default: cout<<"Invalid operation";break;
   
  }
  return 0;
}
 
    