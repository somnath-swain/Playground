#include<iostream>
using namespace std;
int main(){
  int x,i,result=1;
  cin>>x;
  for(i=1;i<=x;i++)
    result=result*i;
  cout<<result;
  return 0;
}