class Node{
    constructor(val){
        this.prev = null;
        this.data = null;
        this.next = null;
    }
}
export class DoublyLinkedList{
    #head;
    #tail;
    #count;

    constructor(){
        this.#head = null;
        this.#tail = null;
        this.#count = 0;
    }
    get isEmpty(){
        return this.#count === 0;
    }

    
    get count(){
        return this.#count;
    }
    
    //Método PRIVADO que encontra um nodo por sua posição!
    #findNode(pos){
        let node;
        if(pos < this.#count / 2) {
            node = this.#head;
            for(let i = 0; i < pos ; i++){
                node = node.next;
            }   
        }else {
            node = this.#tail;
            for(let i = this.#count - 1; i > pos ; i--){
                node = node.prev;
            }
        }
        return node;
    }

    insert(pos, val){
        let inserted = new Node(val);

        //1° Caso: lista vazia
        if(this.isEmpty){
            this.#head = inserted;
            this.#tail = inserted;
        }
        //2° Caso: inserção na primeira posição
        else if(pos === 0){
            inserted.next = this.#head;
            this.#head.prev = inserted
            this.#head = inserted
        }
    
        //3° Caso: inserção na ultima posição
        else if(pos >= this.count){
            inserted.prev = this.#tail;
            this.#tail.next = inserted;
            this.#tail = inserted;
        }
    }
}

let lista = new DoublyLinkedList()