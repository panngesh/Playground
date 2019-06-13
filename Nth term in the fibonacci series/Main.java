#include<stdio.h>
int main()
{
  //Type your code here
  int n,term,term1=1,term2=2,i;
  scanf("%d",&n);
  for(i=3;i<=n;i++)
  {
     
    term=term1+term2;
    term1=term2;
     
    term2=term;
    
  }
  printf("%d",term);
  return 0;
}