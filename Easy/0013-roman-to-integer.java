package Easy;

class Solution {
    public int romanToInt(String s) {
        
   int sum = 0;
    int num = 0;

    for (int i = 0; i < s.length(); i++) {
        char num1 = s.toUpperCase().charAt(i);
        int val1 = 0;

        // assign value for num1
        if (num1 == 'I') val1 = 1;
        else if (num1 == 'V') val1 = 5;
        else if (num1 == 'X') val1 = 10;
        else if (num1 == 'L') val1 = 50;
        else if (num1 == 'C') val1 = 100;
        else if (num1 == 'D') val1 = 500;
        else if (num1 == 'M') val1 = 1000;
        else {
            System.out.println("Invalid input");
            return -1; // stop on invalid char
        }

        // check next char for subtraction case
        if (i + 1 < s.length()) {
            char num2 = s.toUpperCase().charAt(i + 1);
            int val2 = 0;

            if (num2 == 'I') val2 = 1;
            else if (num2 == 'V') val2 = 5;
            else if (num2 == 'X') val2 = 10;
            else if (num2 == 'L') val2 = 50;
            else if (num2 == 'C') val2 = 100;
            else if (num2 == 'D') val2 = 500;
            else if (num2 == 'M') val2 = 1000;
            else {
                System.out.println("Invalid input");
                return -1;
            }

            if (val1 < val2) {
                num = val2 - val1;
                i++; // skip next char
            } else {
                num = val1;
            }
        } else {
            num = val1;
        }

        sum += num;
    }
    return sum;
}
}