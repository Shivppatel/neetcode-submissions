func hasDuplicate(nums []int) bool {
	set := make(map[int]struct{})
	for _, v := range nums{
		_, exists := set[v]
		if exists == true{
			return true
		}
		set[v] = struct{}{}
	}
	return false
}
