# Intuition
## Another simple Java solution

# Approach
<!-- Describe your approach to solving the problem. -->
<pre>
<span style="color: green;">1</span> 1 <span style="color: green;">2</span> 2 2 3  ---> 1 1 <span style="color: blue;">2</span> 2 2 3
  i j

1 <span style="color: green;">1</span> 2 <span style="color: green;">2</span> 2 3  ---> 1 1 2 <span style="color: blue;">2</span> 2 3
    i j

1 1 <span style="color: red;">2</span> 2 <span style="color: red;">2</span> 3  ---> nothing changed
      i j

1 1 <span style="color: green;">2</span> 2 2 <span style="color: green;">3</span>  ---> 1 1 2 2 <span style="color: blue;">3</span> 3
      i   j

1 1 2 2 3 <s>3</s>  ---> final array with five elements considered (return i+1 => 5)
        i j
</pre>

# Complexity
|             |             |
| :---        |    :----:   | 
| Time complexity    | *O(n)* |
| Space complexity   | *O(1)* | 


# Code
```
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return 1;
        int i = 1;
        for(int j = 2; j < nums.length; j++){
            if(nums[j] != nums[i - 1]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
```