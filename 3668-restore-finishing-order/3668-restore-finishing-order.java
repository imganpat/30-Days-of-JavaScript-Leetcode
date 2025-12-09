class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        int n = friends.length, i = 0;
        int [] res = new int[n];
        
        for(int f : friends) {
            set.add(f);
        }

        for(int o: order){
            if(set.contains(o)){
                res[i++] = o;
            }
        }

        return res;
    }
}