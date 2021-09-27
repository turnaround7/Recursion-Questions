class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        function(1,n,k,new ArrayList<>(),ans);
        //box to be -- total box--number of items ---temp_arraylist ---ans 
        return ans;
    }
    public static void function(int current,int n,int k,ArrayList<Integer> temp,List<List<Integer>> ans)
         {
       
         if(temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(current>n)
            return;
       
  
        function(current+1,n,k,temp,ans);
        temp.add(current);
        function(current+1,n,k,temp,ans);
        temp.remove(temp.size()-1);
     
    }
}
