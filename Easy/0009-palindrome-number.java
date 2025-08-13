package Easy;

class Solution {
     boolean isPalindrome(int x) {
        
        int reversed = 0; // variable to store the reversed number of the original number

        if (x < 0 || (x!= 0 && x % 10 == 0)){ // checks for negative numbers and multiples of 10
            return false; 
        } 
        
        while (x > reversed){

            reversed = reversed * 10 + x % 10; // reverses the original number
            x = x / 10; // removes the last digit from the original number

        }

        if (x == reversed || x==reversed/10){ // checks if the original number is equal to the reversed number
            return true;
        } else {
            return false;
        }


    }
}