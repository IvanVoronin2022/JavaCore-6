import java.util.*;

class Graf {
    private int amountOfVertices;
    private ArrayList<Integer>[] verticesInfo;

    public Graf(int amountOfVertices) {
        this.amountOfVertices = amountOfVertices;
        verticesInfo = new ArrayList[amountOfVertices];
        for (int i = 0; i < amountOfVertices; i++) {
            verticesInfo[i] = new ArrayList<Integer>();
        }

    }

    public void addEdge(int a, int b) {
        verticesInfo[a].add(b);
        verticesInfo[b].add(a);
    }

    public ArrayList<Integer> adjacent(int a) {
        return verticesInfo[a];
    }

    public int size() {
        return amountOfVertices;
    }

    public int[] calcPaths(Graf graf) {
        int[] marks = new int[graf.size()];
        ArrayList<Integer> markSizes = new ArrayList<>();
        for (int v = 0; v < graf.size(); v++) {
            if (marks[v] == 0) {
                int next_mark = markSizes.size() + 1;
                int size = dfs(graf, v, next_mark, marks);
                markSizes.add(size);
            }
        }
        int[] answer = new int[graf.size()];
        for (int i = 0; i < graf.size(); i++) {
            answer[i] = markSizes.get(marks[i] - 1) - 1;
        }
        return answer;
    }

    public int dfs(Graf graf, int v, int mark, int[] marks) {
        marks[v] = mark;
        int size = 1;
        for (Integer vv : graf.adjacent(v)) {
            if (marks[vv] == 0) {
                size += dfs(graf, vv, mark, marks);
            }
        }
        return size;
    }
}
