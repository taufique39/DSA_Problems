class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1; i<temperatures.length; i++){
            int currTemp = temperatures[i];

            while(!stack.isEmpty()){
                int idx = stack.peek();
                int tempTop = temperatures[idx];

                if(currTemp > tempTop){
                    days[idx] = i - idx;
                    stack.pop();
                }
                else{
                    break;
                }
            }
            stack.push(i);
        }
        return days;
    }
}



// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] days = new int[temperatures.length];

//         for(int i=0; i<temperatures.length; i++){
//             for(int j=i+1; j<temperatures.length; j++){
//                 // int currTemp = temperatures[i];

//                 if(temperatures[j] > temperatures[i]){
//                     // warm day
//                     days[i] = j - i;
//                     break;
//                 }
//             }
//         }
//         return days; 
//     }
// }