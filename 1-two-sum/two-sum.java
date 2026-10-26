class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // No solution found - per problem statement, this will never happen.
        return new int[] {};


    }
}

// public class Main {
//     public static void main(String[] args) {
//         twoSum solver = new twoSum();

//         int[] result = solver.twoSum(new int[] {2, 7, 11, 15}, 9);

//         System.out.println("[" + result[0] + ", " + result[1] + "]");
//     }
// }
