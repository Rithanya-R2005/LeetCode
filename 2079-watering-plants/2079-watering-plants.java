class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0,max=capacity;
        for(int i=0;i<plants.length;i++){
            if(capacity>plants[i]){
                steps+=1;
                capacity=capacity-plants[i];
            }
            else if(capacity==plants[i]){
                steps+=1;
                capacity=0;
            }
            else if(capacity<plants[i]){
                steps=steps+(i+1)*2-1;
                capacity=max;
                capacity-=plants[i];
            }
        }
        return steps;
    }
}