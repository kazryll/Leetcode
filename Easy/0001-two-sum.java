package Easy;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        //declare variables
        int result[] = new int[2];

        //for loop to iterate num1
        for (int i = 0; i < nums.length; i++){

            //nested for loop to iterate num2
            for (int j = i + 1; j < nums.length; j++){

                //if-else condition in order to determine if num1 and num2 results to target
                if (nums[i] + nums[j] == target){

                    result[0] = i;
                    result [1] = j;
                    return result;
                }

            }

        }return result;

    }
}