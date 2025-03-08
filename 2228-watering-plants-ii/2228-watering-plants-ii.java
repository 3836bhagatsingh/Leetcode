class Solution {
    public int minimumRefill(int[] nums, int capacityA, int capacityB) {
        int n = nums.length;
        int init_A = capacityA; // Initial capacity of Alice
        int init_B = capacityB; // Initial capacity of Bob
        int ans = 0; // Refill count
        int i = 0, j = n - 1; // Pointers for Alice and Bob

        while (i < j) {
            // Alice waters plant i
            if (nums[i] <= capacityA) {
                capacityA -= nums[i];
            } else {
                ans++; // Refill Alice's can
                capacityA = init_A - nums[i]; // Reset capacity after refill
            }

            // Bob waters plant j
            if (nums[j] <= capacityB) {
                capacityB -= nums[j];
            } else {
                ans++; // Refill Bob's can
                capacityB = init_B - nums[j]; // Reset capacity after refill
            }

            i++;
            j--;
        }

        // Handle the middle plant if n is odd
        if (i == j) {
            // Alice is responsible for the middle plant if she has more or equal capacity
            if (capacityA >= capacityB) {
                if (nums[i] > capacityA) {
                    ans++; // Refill Alice's can
                }
            } else {
                if (nums[i] > capacityB) {
                    ans++; // Refill Bob's can
                }
            }
        }

        return ans;
    }
}