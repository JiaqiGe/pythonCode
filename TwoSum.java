// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example:
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].


public class TwoSum{
  public int[] twoSum(int[] nums, int target){
    if(nums.length == 0){
      return new int[2];
    }

    // (value, index)
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      int res = target - nums[i];

      if(map.containsKey(res)){
        return new int[]{map.get(res), i};
      }else{
        map.put(nums[i], i);
      }
    }

    return new int[]{-1,-1};
  }
}