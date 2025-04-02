/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let result = init;
    const length = nums.length;
    for(let i = 0; i < length; i++)
       result = fn(result, nums[i]);
    return result;
};