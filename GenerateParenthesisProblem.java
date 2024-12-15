class GenerateParenthesisProblem {
    public static void generateParenthesisDFS(int openCount, int closeCount, String currentString, int maxPairs, List<String> result) {
        if (openCount == maxPairs && closeCount == maxPairs) {
            result.add(currentString);
            return;
        }
        if (openCount < maxPairs) {
            generateParenthesisDFS(openCount + 1, closeCount, currentString + "(", maxPairs, result);
        }
        if (closeCount < openCount) {
            generateParenthesisDFS(openCount, closeCount + 1, currentString + ")", maxPairs, result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisDFS(0, 0, "", n, result);
        return result;
    }
}
