package io.github.redkcn.leetcode75.string;

/**
 * 1768. Merge Strings Alternately You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If
 * a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 *
 * @author vicente
 * @version 1.0
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">Merge Strings Alternately</a>
 * @since 2024/09/21
 */
public class MergeStrings {

    /**
     * Complexity: O(min(word1.length(), word2.length()))
     *
     * @param word1 first word
     * @param word2 second word
     * @return alternately merged string
     */
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return word1 == null ? word2 : word1;
        }

        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        String largeStr = word1.length() > word2.length() ? word1 : word2;
        sb.append(largeStr.substring(min));

        return sb.toString();
    }

}
