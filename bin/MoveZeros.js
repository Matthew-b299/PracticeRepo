
moveZeros = (arr) => {
    let count = 0
    for (let i = 0; i < arr.length; i++)
        if (arr[i] != 0)
            arr[count++] = arr[i]
            

    while (count < arr.length)
        arr[count++] = 0;

 
    // const arr = nums.map((elements) => {
    //     return elements
        
      
    // })


    // return arr;

    return arr
}



const map1 = [1,0,0,5,6]

// for(x in map1)
// {
//     if(map1[x] == 0 )
//     {
//         console.log(x)
//     }
// }
console.log(moveZeros(map1))


