class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product=1;
        int temp = n;


        while(n > 0 )
        {
            int d = n%10;
            sum += d;
            product *= d;
            n/=10;

        }
        
        int div = sum + product;
        return temp % div == 0;
        
        
    }
}