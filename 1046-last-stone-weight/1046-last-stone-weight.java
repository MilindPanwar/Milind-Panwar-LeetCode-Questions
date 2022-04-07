class Solution {

    public int lastStoneWeight(int[] stones) {
        //making priority queue
        //adding a,b points to b-a, which makes it a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));

        //adding all elements of stones array to max heap
        for (int stone : stones) {
            pq.offer(stone);
        }
        //till pq size is one
        while (pq.size() > 1) {
            //first largest element in max heap
            //first largest element is pulled out
            int fl = pq.poll();

            //second largest element in max heap
            //second largest element is pulled out
            int sl = pq.poll();

            if (fl == sl) {
                //if both are equal, then both are destoyed
                continue;
            } else {
                //if both are not equal, subtracting sl from fl
                int dist = fl - sl;
                //adding subtracted value in heap
                pq.offer(dist);
            }
        }
        //if heap size is 0 then return 0
        //if not zero then return element which is left in heap
        return pq.size() == 0 ? 0 : pq.poll();
    }
}
