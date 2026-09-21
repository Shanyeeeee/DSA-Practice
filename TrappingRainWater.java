class Solution {
    public int trap(int[] height) {
        int left =0,right=height.length-1;
        int maxLeft=0,maxRight=0;
        int trapper =0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>maxLeft){
                    maxLeft=height[left];
                } 
                trapper+= maxLeft-height[left];
                left++;
            } else{
                if(height[right]>maxRight){
                    maxRight = height[right];
                }
                trapper+= maxRight-height[right];
                right--;
            }
        }
        return trapper;
    }
}
