class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int output = 0;
        while(left <= right){
            if (people[left] + people[right] <= limit){
                output += 1;
                left++;
                right--;
            } else if (people[right] <= limit){
                output += 1;
                right--;
            } else {
                output += 1;
                left++;
            }
        }
        return output;
    }
}