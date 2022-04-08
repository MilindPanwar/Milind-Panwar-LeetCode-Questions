class KthLargest {
    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        //constructor k
        this.k = k;
        //not passing any comparator so it will be initialised as min heap
        minHeap = new PriorityQueue<>();
        for (int el : nums) {
            //calling method
            add(el);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        //if size of heap is greater than k
        //popping out the minimum element from heap
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        //returning the topmost element of heap
        //which is the kth element because of if condition in add() method
        return minHeap.peek();
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
