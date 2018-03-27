func twoSum(nums []int, target int) []int {
	sum := 0
    var ansi,ansj int
	for i := 0; i <len(nums); i++ {
		for j := 0; j <len(nums); j++{
			sum = nums[i]+nums[j]
			if sum==target && i!=j{
            ansi = i
            ansj = j
			}
		}
	}
     return []int{ansj,ansi}
}