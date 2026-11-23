import java.util.ArrayList;
import java.util.List;

class Solution {
    private int cnt = 0;

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        mergeSortHelper(nums, 0, nums.length - 1);
        return cnt;
    }

    private void mergeSortHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSortHelper(arr, left, mid);
        mergeSortHelper(arr, mid + 1, right);
        countPairs(arr, left, mid, right);
        merge(arr, left, mid, right);
    }

    private void countPairs(int[] arr, int left, int mid, int right) {
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            cnt += j - (mid + 1);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        List<Integer> leftPart = new ArrayList<>();
        List<Integer> rightPart = new ArrayList<>();

        for (int index = left; index <= mid; index++) {
            leftPart.add(arr[index]);
        }
        for (int index = mid + 1; index <= right; index++) {
            rightPart.add(arr[index]);
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int writeIndex = left;

        while (leftIndex < leftPart.size() && rightIndex < rightPart.size()) {
            if (leftPart.get(leftIndex) <= rightPart.get(rightIndex)) {
                arr[writeIndex++] = leftPart.get(leftIndex++);
            } else {
                arr[writeIndex++] = rightPart.get(rightIndex++);
            }
        }

        while (leftIndex < leftPart.size()) {
            arr[writeIndex++] = leftPart.get(leftIndex++);
        }

        while (rightIndex < rightPart.size()) {
            arr[writeIndex++] = rightPart.get(rightIndex++);
        }
    }
}