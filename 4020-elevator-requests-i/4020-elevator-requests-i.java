class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int startFloor=0;
        int totalTime=0;

        for(int i=0; i<requests.length; i++){
            totalTime+=Math.abs(requests[i] -startFloor);
            startFloor=requests[i];
        }
        return totalTime;
    }
}