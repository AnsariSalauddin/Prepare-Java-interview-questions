package in.common;


public class LongestCommonSubstringTwoString {
    public static void longestCommonSubstringTwoString(String string, String string1) {
        int n = string.length();
        int m = string1.length();
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        int endIndex = 0; // To track the end index of the longest common substring in `string`

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (string.charAt(i - 1) == string1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        endIndex = i; // Store the last matched index in `string`
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // Extract the longest common substring
        String longestSubstring = string.substring(endIndex - max, endIndex);

        // Print results
        System.out.println("Longest Common Substring Length: " + max);
        System.out.println("Longest Common Substring: " + longestSubstring);
    }

    public static void main(String[] args) {
        longestCommonSubstringTwoString("abdceg", "abdceh");
        //longestCommonSubstringTwoString("abcde", "cdeab");
    }
}

