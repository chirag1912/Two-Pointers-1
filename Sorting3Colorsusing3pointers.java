//Most Optimized solution:
//Using three pointers low, mid, high
//keeping low to be for 0, mid for 1 and high for 2;

//TC: O(n) with one pass approach;
//SC: O(1) as changing within the same array;

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null && nums.length==0){
            return;
        }
        
        int low=0,mid=0;
        int high=nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;              //compulsary to inc the mid as the value of low increases;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            //    if(mid<low){
            //     mid++;
            // }
            else{
                mid++;
            }
        }
    }
    
    public static void swap(int[] nums,int i,int j){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}


//Calculating the no of colors in the array keeping a count of the no of colors
//and then pushing the colors in the array in 2nd pass;

//TC: O(n) with two pass approach;
//SC: O(1) as changing within the same array;

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        
        int x=0,y=0,z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                x++;
            }if(nums[i]==1){
                y++;
            }if(nums[i]==2){
                z++;
            }
        }
        
        int[] nums1=new int[nums.length];
        
        System.out.println(x+" "+y+" "+z);
        
        for(int i=0;i<nums.length;){
            while(x>0){
                nums[i]=0;
                x--;
                i++;
            }
            while(y>0){
                nums[i]=1;
                y--;
                i++;
            }
            while(z>0){
                nums[i]=2;
                z--;
                i++;
            }
        }
        
        
    }
}


