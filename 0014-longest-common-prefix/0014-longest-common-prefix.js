/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    const word = strs[getSmallestWordIndex(strs)];
    let res = word; 

    strs.forEach(w => {
        let tempRes = "";
        for (let i = 0; i < res.length && i < w.length; i++) {
            if (w[i] === res[i]) 
                tempRes += w[i];
            else
                break;
        }
        res = tempRes; 
    });
    return res;
};

let getSmallestWordIndex = (strs) => {
    let tempIndex = strs[0].length;
    let index = 0;
    for (let i = 1; i < strs.length; i++) 
        if (strs[i].length < tempIndex) {
            tempIndex = strs[i].length;
            index = i;
        }
    return index;
};