//Time: O(N+k)
//Space: O(N)
public int deleteAndEarn(int[] nums) {
        int max=0;
        for ( int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
        }
        
        int []arr= new int[max+1];
        
        for( int i=0;i<nums.length;i++){
            
            arr[nums[i]]+=nums[i];
        }
        
        int taken=arr[0];
        int not=0;
        
        for( int i=1;i<arr.length;i++){
            
            int take=arr[i]+not;
            int leave=Math.max(taken,not);
            taken=take;
            not=leave;
        }
        return Math.max(taken, not);
    }
