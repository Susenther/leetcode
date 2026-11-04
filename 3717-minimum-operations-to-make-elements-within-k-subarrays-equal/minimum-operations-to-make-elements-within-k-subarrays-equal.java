import java.util.*;

class Solution {
    int m;
    long[] cnt, sum;

    void update(int i, long c, long v) {
        for (; i <= m; i += i & -i) {
            cnt[i] += c;
            sum[i] += v;
        }
    }

    // returns {count, sum} for indices 1..i
    long[] query(int i) {
        long c = 0, s = 0;
        for (; i > 0; i -= i & -i) {
            c += cnt[i];
            s += sum[i];
        }
        return new long[]{c, s};
    }

    // smallest index whose prefix count >= kth
    int kth(int kth) {
        int pos = 0;
        int LOG = Integer.highestOneBit(m);
        for (int pw = LOG; pw > 0; pw >>= 1) {
            int np = pos + pw;
            if (np <= m && cnt[np] < kth) {
                pos = np;
                kth -= cnt[np];
            }
        }
        return pos + 1;
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        // coordinate compression
        int[] sorted = Arrays.stream(nums).distinct().sorted().toArray();
        m = sorted.length;
        cnt = new long[m + 1];
        sum = new long[m + 1];
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            idx[i] = Arrays.binarySearch(sorted, nums[i]) + 1;
        }

        // cost of each window [i, i+x-1]
        int W = n - x + 1;
        long[] cost = new long[W];
        long windowSum = 0;
        for (int i = 0; i < n; i++) {
            update(idx[i], 1, nums[i]);
            windowSum += nums[i];
            if (i >= x) {
                update(idx[i - x], -1, -nums[i - x]);
                windowSum -= nums[i - x];
            }
            if (i >= x - 1) {
                int medIdx = kth((x + 1) / 2);
                long med = sorted[medIdx - 1];
                long[] q = query(medIdx);
                long cLE = q[0], sLE = q[1];
                cost[i - x + 1] = med * cLE - sLE + (windowSum - sLE) - med * (x - cLE);
            }
        }

        // dp over number of chosen windows
        final long INF = Long.MAX_VALUE / 4;
        long[] prev = new long[n + 1]; // j = 0 -> cost 0
        for (int j = 1; j <= k; j++) {
            long[] cur = new long[n + 1];
            Arrays.fill(cur, INF);
            for (int i = 1; i <= n; i++) {
                cur[i] = cur[i - 1];
                if (i >= x && prev[i - x] < INF) {
                    cur[i] = Math.min(cur[i], prev[i - x] + cost[i - x]);
                }
            }
            prev = cur;
        }
        return prev[n];
    }
}