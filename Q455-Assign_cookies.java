public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
         int count=0;
         int i=0; //pointer for g
         int j=0; // pointer for s
        while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            count++;
            i++;
            j++;
        }
        else{
            j++;
        }  
        }
        return count;
    }