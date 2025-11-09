package CodeSolving_DSA;

public class MergeString_Alternative {
    public String mergeAlternate(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();

        int i = 0;

        while (i < w1 || i < w2) {
            if (i < w1)
                sb.append(word1.charAt(i));
            if (i < w2)
                sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeString_Alternative obj = new MergeString_Alternative();

        String word1 = "abc";
        String word2 = "pqr";

        String result = obj.mergeAlternate(word1, word2);
        System.out.println("Merged String: " + result);
    }
}
