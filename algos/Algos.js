function noCp(a,b){
    let count = 0
    let mapB = new Map()
    for (let i=0; i<b.length;i++){
        mapB.get(b[i]) ?
        mapB.set(b[i], mapB.get(b[i]) + 1): mapB.set(b[i], 1)
    }
    let mapA = new Map()
    for (let i=0; i<a.length;i++){
        mapA.get(a[i]) ?
        mapA.set(a[i], mapA.get(a[i]) + 1): mapA.set(a[i], 1)
    }
    while (mapB.size > 0){
        for (let i=0; i<a.length;i++){
            if (mapB.get(a[i])){
                mapB.set(a[i], mapB.get(a[i]) - 1)
            }
            if (mapB.get(a[i]) == 0){
                mapB.clear()
            }
        }
        count++
    }
    return count
}

//console.log(noCp([1,2,3],[2,1,2]))
//comm
class Node{
    constructor(val){
        this.data = val;
        this.next = null;
    }
}

class SLL{
    constructor(){
        this.head = null;
    }

    addFront(val){
        let newNode = new Node(val);

        if (!this.head){
            this.head = newNode;
            return this;
        }

        newNode.next = this.head;
        this.head = newNode;
        return this;
    }
}

//coding
function twoSum(num, target){
    let map = new Map();
    for (let i=0; i<num.length; i++){
        if (!map.get(num[i])){
            map.set(num[i], i)
        }
    }

    for (let i=0; i<num.length; i++){
        if (map.get(target - num[i])){
            return [i, map.get(target - num[i])]
        }
    }
    console.log(map)
    return 1
}

//console.log(twoSum([2,7,11,15],9))

function boxes(arr, num){
    
    let count = 0;
    let boxes = 0;
    if (arr.length == 0){
        return 0
    }
    
    arr.sort((a,b)=> b[1]-a[1])
    for (let i=0; i<arr.length; i++){
        if (arr[i][0] < num - boxes){
            count += arr[i][0] * arr[i][1]
            boxes += arr[i][0]
        }else{
            let leftOvers = num - boxes
            count += leftOvers * arr[i][1]
            boxes += leftOvers
        }
        
    }
    return count
}
console.log('r',boxes([[1,3],[2,2],[3,1]], 4))//8
console.log('r',boxes([[5,10],[2,5],[4,7],[3,9]], 10))//91




function matrix(arr){
    
    let max = -Infinity
    for (let i=0; i<arr.length-2; i++){
        
        for (let j=0; j<arr[i].length-2; j++){
            let top = arr[i][j] + arr[i][j+1] + arr[i][j+2]
            let middle = arr[i+1][j+1]
            let bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
            let sum = top + middle + bottom
            if (sum > max){
                max = sum;
            }
        }
        
    }
    return max
}

// console.log(matrix([[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]))

function water(arr,can){
    let steps = 0;
    let maxCan = can;
    let i = 0;
    // for (let i=0; i<arr.length; i++){
    //     if (arr[i] <= can){
    //         can -= arr[i]
    //         steps ++
    //     }else{
    //         steps += i * 2
    //         can = maxCan
    //         i--
    //     }
    // }
    while (i < arr.length){
        if (arr[i] <= can){
            can -= arr[i]
            steps++
            i++
            console.log('g')
        }else{
            steps += i*2
            can = maxCan
            console.log(arr[i])
        }
    }
    return steps
    
}

// console.log(water([2,2,3,3],5))//14

//comment


