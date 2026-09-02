class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;

        Set<Integer> count = new HashSet<>();
        
        for(int i : candyType){
            count.add(i);
        }

        int result = count.size();
        if(result >= n/2){
            return n/2;
        }
        return result;
    }
}