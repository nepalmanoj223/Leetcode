import java.util.Arrays;
public class Leetcode34 {
    public static void main(String[] args) {
        int []nums={1,2,3,4,4,5,6,7};
        int target=4;
        int[] ans = arr(nums, target);  
        System.out.println(Arrays.toString(ans));
    }
static int[] arr(int[] nums, int target){
    int start = 0;
    int end = nums.length - 1;
    int first = -1;
    int last = -1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(target == nums[mid]){
            first = mid;
            last = mid;

            
            int left = mid - 1;
            while(left >= start && nums[left] == target){
                first = left;
                left--;
            }

           
            int right = mid + 1;
            while(right <= end && nums[right] == target){
                last = right;
                right++;
            }

            break; 
        }
        else if(target > nums[mid]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }

    return new int[]{first, last};
}
}
