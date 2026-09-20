class Solution {
    public int maxArea(int[] heights) {
        int left =0, right = heights.length-1;
        int maxarea=0;
        while(left<right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxarea = Math.max(maxarea,area);
            if(heights[left]<heights[right])
                left++;
            else 
                right--;
        }
        return maxarea;
    }
}
