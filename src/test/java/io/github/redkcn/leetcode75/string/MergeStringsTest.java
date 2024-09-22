package io.github.redkcn.leetcode75.string;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;


public class MergeStringsTest {

    public MergeStrings solution;

    @Before
    public void init() {
        solution = new MergeStrings();
    }

    @Test
    public void testMergeAlternatelyEqualLength() {
        String result = solution.mergeAlternately("abc", "def");
        assertEquals("adbecf", result);
    }

    @Test
    public void testMergeAlternatelyWord1Longer() {
        String result = solution.mergeAlternately("abcde", "fgh");
        assertEquals("afbgchde", result);
    }

    @Test
    public void testMergeAlternatelyWord2Longer() {
        String result = solution.mergeAlternately("abc", "defgh");
        assertEquals("adbecfgh", result);
    }

    @Test
    public void testMergeAlternatelyNullInput() {
        String result = solution.mergeAlternately(null, "def");
        assertEquals("def", result);

        result = solution.mergeAlternately("abc", null);
        assertEquals("abc", result);

        result = solution.mergeAlternately(null, null);
        assertNull(result);
    }

    @Test
    public void testMergeAlternatelyEmptyStrings() {
        String result = solution.mergeAlternately("", "");
        assertEquals("", result);
    }
}
