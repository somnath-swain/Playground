#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
  int aus_ball,aus_run, ind_run, ind_ball,tot_over;
  float over_fin, crr, trr,to_win;
  cin>>aus_ball;
  cin>>aus_run;
  cin>>ind_run;
  cin>>ind_ball;
  tot_over=aus_ball/6;
  cout<<tot_over<<endl;
  over_fin= ind_ball/6 +(ind_ball%6)/10.00;
  crr=ind_run/over_fin;
  cout<<over_fin<<endl;
  cout<<fixed<<setprecision(1)<<crr<<endl;
  trr=aus_run/50.0;
  cout<<trr<<endl;
  if(trr<crr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
}