class Solution {
    void twoSum(int [] nums, int k, List<List<Integer>> result, int target){
        int i = k;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                while(i < j && nums[i] == nums[i+1]){
                    i++;
                }
                while( i < j && nums[j] == nums[j-1]){
                    j--;
                }
                result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], -target))); // this will give {n1,n2,n3} such that n2 + n3 = -n1
                i++;
                j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        // Sort the array
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]);
        }
        return result;
    }
}
