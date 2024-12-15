class LargestRectangleAreaProblem {
    public int largestRectangleArea(int[] h) {
        int max=0;
        Stack<int []>s=new Stack<>();
        for(int i=0;i<h.length;i++){
            int st=i;
            while(s.size()>0&&s.peek()[1]>h[i]){
                int t[]=s.pop();
                int ind=t[0],ht=t[1];
                st=ind;
                max=Math.max(max,ht*(i-ind));
            }
            s.push(new int[]{st,h[i]});
        }
        for(int i[]:s){
            max=Math.max(max,(h.length-i[0])*i[1]);
        }
        return max;
    }
}