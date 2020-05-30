#include<iostream>
using namespace std;
int main()
{
 int row,column;
  int tree;
  cin>>row;
  cin>>column;
  cin>>tree;
  if(tree>=0 && tree<=column)
  cout<<"Yes";
  else if(tree>=0 && tree<=row)
  cout<<"Yes";
  else if(tree%column==0)
    cout<<"Yes";
  else if(tree%column==1)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
  
}