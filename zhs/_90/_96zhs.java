package _90;

public class _96zhs {
    int[] counts;

    public int numTrees(int n) {
        if (n == 0 || n == 1)
            return 1;
        counts = new int[n + 1];
        counts[0] = 1;
        counts[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                counts[i] += (counts[j] * counts[i - j - 1]);
            }
        }
        return counts[n];
    }
    public static void main(String[] args){
        _96zhs t = new _96zhs();
        System.out.println(t.numTrees(3));
    }
}