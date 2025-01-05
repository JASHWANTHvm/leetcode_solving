int firstMissingPositive(int* nums, int numsSize) {
    int n = numsSize;
    bool* demo = calloc(n+1,sizeof(bool));
    for(int i=0 ; i<n; i++)
    {
        int num = nums[i];
        if(num>0 && num<=n)
        {
            demo[num]=true;
        }
    }
    for(int i=1;i<=n;i++)
    {
        if(!demo[i])
        return i;
    }
    return n+1;
}