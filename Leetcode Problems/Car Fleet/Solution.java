// https://leetcode.com/problems/car-fleet/description/

import java.util.Stack;
import java.util.HashMap;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> fleet = new Stack<Float>();
        HashMap<Integer, Integer> cars = new HashMap<>();
        float dist = 0;
        
        for (int i = 0; i < position.length; i++) {
            cars.put(position[i], speed[i]);
        }

        Arrays.sort(position);

        for (int i = position.length - 1; i >=0 ; i--) {
            dist = (float)(target - position[i]) / cars.get(position[i]);
            if(fleet.empty() || dist > fleet.peek()) {
                fleet.push(dist);
            }
        }
        return fleet.size();
    }
}