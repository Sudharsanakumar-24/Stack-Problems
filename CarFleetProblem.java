class CarFleetProblem {
    public int carFleet(int target, int[] p, int[] s) {
        int pair[][]=new int[p.length][2];
        for(int i=0;i<p.length;i++){
                pair[i][0]=p[i];
                pair[i][1]=s[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));
        Stack<Double>st=new Stack<>();
        for(int i[]:pair){
            st.push((double)(target-i[0])/i[1]);
            while(st.size()>1&&st.peek()<=st.get(st.size()-2))
                st.pop();
        }
        return st.size();
    }
}
