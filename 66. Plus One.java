class Solution {
    // TC - O(N), SC - O(N)
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        // If all the digits in the array are 9
        int all[] = new int[digits.length + 1];
        all[0] = 1;
        return all;
    }
}
