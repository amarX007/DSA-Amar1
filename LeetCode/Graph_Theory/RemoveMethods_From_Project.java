package CodeSolving_DSA.LeetCode.Graph_Theory;

import java.util.*;

public class RemoveMethods_From_Project {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        // s1 : Make an adjacency list for the given graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] invocation : invocations) {
            graph.get(invocation[0]).add(invocation[1]);
        }

        // s2 : Use Breath First Search (BFS) to find all suspicious methods reachable from k
        boolean [] isSus = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(k);
        isSus[k] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int neighbor : graph.get(curr)) {
                if (!isSus[neighbor]) {
                    isSus[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

         // s3 : Check if any non-sus method invokes a sus method
        for (int [] invocation : invocations) {
            int u = invocation[0];
            int v = invocation[1];

            // if an external method calls a sus method, then the group is not isolated
            if (!isSus[u] && isSus[v]) {
                List<Integer> allMethds = new ArrayList<>();
                for (int i=0; i<n; i++) {
                    allMethds.add(i);
                }
                return allMethds;
            }
        }

        // s4 : Return only the safe, non-sus methods
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (!isSus[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        int[][] invocations= {
                {1,2},
                {0,1},
                {3,2}
        };

        RemoveMethods_From_Project cons = new RemoveMethods_From_Project();

        List<Integer> ans = cons.remainingMethods(n, k, invocations);
        System.out.println(ans);
    }
}