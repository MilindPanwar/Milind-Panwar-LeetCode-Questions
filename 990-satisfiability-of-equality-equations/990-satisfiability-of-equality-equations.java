class Solution {
    public boolean equationsPossible(String[] equations) {
        ArrayList<Integer>[] graph = new ArrayList[26];
        for (int i = 0; i < 26; ++i){
            graph[i] = new ArrayList(); 
        }            
        for(String equation: equations){
            int n1 = equation.charAt(0) - 'a';
            int n2 = equation.charAt(3) - 'a';
            char op = equation.charAt(1);
            if(op == '='){
                graph[n1].add(n2);
                graph[n2].add(n1);
            }
        }        
        
        //2.use DFS to color all connected vertices in the same color
        int[] color = new int[26];
        int curColor = 0;
        for(int i = 0; i < 26; i++){
            List<Integer> edgeList = graph[i];
            for(int j = 0; j < edgeList.size(); j++){
                int v = edgeList.get(j);
                if(color[v] == 0){
                    ++curColor;
                    DFS(v, color, curColor, graph);
                }
            }
        }

        //3.we check inequality equations
        for(String equation: equations){
            int n1 = equation.charAt(0) - 'a';
            int n2 = equation.charAt(3) - 'a';
            char op = equation.charAt(1);
            if(op == '!'){
                
                if(n1 == n2 || (color[n1] != 0 && color[n1] == color[n2])){
                    return false;
                }
            }
        }
        return true;
    }
    
    private void DFS(int v, int[] color, int curColor, ArrayList<Integer>[] graph){
        color[v] = curColor;
        List<Integer> edgeList = graph[v];
        for(int i = 0; i < edgeList.size(); i++){
            int nextV = edgeList.get(i);
            if(color[nextV] == 0){
                DFS(nextV, color, curColor, graph);
            }
        }
    }
}