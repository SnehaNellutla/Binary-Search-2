// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class FindPeakArray {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid == 0 ||nums[mid]>nums[mid-1])&& (mid==nums.length-1||nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(mid>0 && nums[mid]<nums[mid-1]){
                high = mid - 1;
            }

			else{low = mid + 1;
                }

            }
        return -1;
        }
    public static void main(String args[]) {
    	FindPeakArray ob=new FindPeakArray();
    	int arr[]= {1,2,3,1};
    	System.out.print(ob.findPeakElement(arr));
    }
}