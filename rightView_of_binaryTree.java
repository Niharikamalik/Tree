class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
         ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(node==null)
        return ans;
        
        q.add(node);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0; i<size; i++)
            {
                Node t=q.poll();
                if(i==size-1)
                {
                    ans.add(t.data);
                }
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
            }
        }
        
        return ans;
    }
}

