class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i : nums) {
            pQueue.add(i);
        }
        return pQueue.poll();
    }
}