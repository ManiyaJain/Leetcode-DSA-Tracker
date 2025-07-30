class Solution {
    public int singleNumber(int[] nums) {
        // TC - O(N), SC - O(1)
        int r = 0;
        for(int val : nums){
            r = r ^ val;
        }
        return r;

        // Approach 2 - Hashing
        // But it uses an extra space
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int val : nums){
        //         map.put(val, map.getOrDefault(val, 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;
    }
}
