#include<iostream>
using namespace std;
int main()
{
int bor, interest,year; float int_amount, total_amount, discount, fina;
  cin>>bor;
  cin>>interest;
  cin>>year;
  int_amount=(bor*interest*year)/100;
  total_amount=int_amount+bor;
  discount= int_amount*2/100;
  fina= total_amount-discount;
  cout<<int_amount<<"\n"<<total_amount<<"\n"<<discount<<"\n"<<fina;
  return 0;
}