//https://leetcode.com/problems/maximum-profit-in-job-scheduling/?envType=daily-question&envId=2024-01-06
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
import java.util.Arrays;

public class JobScheduling {
    static class Job {
        int start, end, profit;
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> a.end - b.end);

        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for (int i = 1; i < n; i++) {
            int profitIncludingCurrentJob = jobs[i].profit;
            int l = findLastNonConflictingJob(jobs, i);
            if (l != -1) {
                profitIncludingCurrentJob += dp[l];
            }
            dp[i] = Math.max(dp[i - 1], profitIncludingCurrentJob);
        }

        return dp[n - 1];
    }

    private static int findLastNonConflictingJob(Job[] jobs, int index) {
        int low = 0, high = index - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid].end <= jobs[index].start) {
                if (jobs[mid + 1].end <= jobs[index].start) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] startTime = {1,2,3,3};
        int[] endTime = {3,4,5,6};
        int[] profit = {50,10,40,70};
        System.out.println(jobScheduling(startTime, endTime, profit)); // 120

        int[] startTime2 = {1,2,3,4,6};
        int[] endTime2 = {3,5,10,6,9};
        int[] profit2 = {20,20,100,70,60};
        System.out.println(jobScheduling(startTime2, endTime2, profit2)); // 150

        int[] startTime3 = {1,1,1};
        int[] endTime3 = {2,3,4};
        int[] profit3 = {5,6,4};
        System.out.println(jobScheduling(startTime3, endTime3, profit3)); // 6
    }
}
