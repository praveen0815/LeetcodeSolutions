class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;   // possible answer, search left side
            } else {
                left = mid + 1;    // move right
            }
        }

        // wrap-around case handled here
        return letters[left % letters.length];
    }
}
