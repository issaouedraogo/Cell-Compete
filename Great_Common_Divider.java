// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class GCD
{
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int generalizedGCD(int arr[])
  {
    // INSERT YOUR CODE HERE
    int gcd = arr[0];
    for(int i=1;i<arr.length;i++){
        gcd = findgCd(arr[i], gcd);
    }
    return gcd;
  }
  // METHOD SIGNATURE ENDS
  public static int findgCd(int a, int b){
      if(a == 0){
          return b;
      }else{
          return findgCd(b%a,a);
          }
    }
}
