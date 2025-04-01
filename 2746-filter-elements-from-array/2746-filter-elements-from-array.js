/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let filteredArr = [];
    const length = arr.length;
    for(let i = 0; i < length; i++)
        if(fn(arr[i], i)) 
            filteredArr.push(arr[i]);   
    return filteredArr;
};