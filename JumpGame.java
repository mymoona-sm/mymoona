class JumpGame {
    public boolean canReach(int[] arr, int start) {
        return canReach(arr, start, new boolean[arr.length]);
    }
    
    public boolean canReach(int[] arr, int start, boolean[] dp) {
        if(start < 0 || start >= arr.length || dp[start]) return false;
        if(arr[start] == 0) return true;
        dp[start] = true;
        return canReach(arr, start-arr[start], dp) || canReach(arr, arr[start]+start, dp);
    }
}
