#include<iostream>
using namespace std;
int main()
{float y,price;
 int x;
 cin>>x;
 cin>>y;

 if(x>=13)
 {
   if(y>13&& y<14)
     price=5.00;
   else
     price=8.00;
 }
 else
 {

   if(y>13 &&y<14)
     price=2.00;
   else
     price=4.00;
 }

 cout<<"$"<<price<<".00";
 return 0;
}