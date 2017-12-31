package StringPrefix;

public class Main {

    private static final String[] listaStringow = {"aaab","aAb","aab","abc"};

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.longestCommonPrefix(listaStringow));
    }


}
