class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //store each number and its frequency
        Map<Integer, Integer> count = new HashMap<>();

        //create buckets based on frequency
        List<Integer>[] freq = new List[nums.length+1];

        //Initialize every bucket as an empty list
        for (int i =0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        //count the occurences of each number & update in hashmap
        for (int n:nums){
            count.put(n, count.getOrDefault(n,0)+1);
        }

        //Put each numnber into the bucket matching its frequency
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        //create an array to hold the answer
        int[] res = new int[k];
        int index = 0;

        //Visit buckets from highest frequency to lowest
        for (int i =freq.length-1;i>0 && index<k; i--){
            for (int n : freq[i]){
                res[index] = n;
                index++;

                if (index ==k ){
                    return res;
                }
            }
        }
      return res;
    }
}
