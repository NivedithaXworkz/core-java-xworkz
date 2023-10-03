class ReverseNum
{
static int n=98765626;
 static int rev=0,dig; 
 public static void main(String args[])
 {
  while(n>0)
  {
  dig=n%10;
  rev=rev*10+dig;
  n=n/10;
   }
   System.out.println(rev);
 }
}