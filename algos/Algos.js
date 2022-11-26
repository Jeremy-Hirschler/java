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

// let list = new SLL();
// console.log(list.addFront(4).addFront(7))