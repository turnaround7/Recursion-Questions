class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int temp[]=new int[nums.length];
      // -11 coz constarints are from -10 to 10 (for better way put integer.max_value )
      // was 0 initially but was getting wrong coz nums[i]=0 in few cases
      
        Arrays.fill(temp, -11);
      // 0 --- index of current nums element 
        function(nums,0,temp,ans);
        return ans;
    }
    
    public static void function(int[] nums,int current,int[] temp,List<List<Integer>> ans)
    {
        if(current>=nums.length)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int i:temp)
                a.add(i);
            ans.add(a);
            return ;
        }
        for( int i=0;i<temp.length;i++)
        {
            if(temp[i]==(-11))
            {
                temp[i]=nums[current];
                function(nums,current+1,temp,ans);
                temp[i]=-11;
            }
        }
    }
}
