class Node{
    constructor(val){
        this.data = val;
        this.next = null;
    }
}

export default class LinkedList{
    #head // inicio da lista
    #tail // final da lista
    #count // Quantidade de nodos da lista;

    constructor(){
        this.#head = null;
        this.#tail = null;
        this.#count = 0;
    }
    get isEmpty(){
        return this.#count === 0
    }

    get count(){
        return this.#count
    }


    //metodo para inserir em qualquer posição 
    insert(posicao, valor){
        //cria o nodo para armazenar o valor pretendido
        const inserted = new Node(valor)
        //1° caso: a lista esta vazia
        if(this.isEmpty){
            console.log('vazia')
            this.#head = inserted;
            this.#tail = inserted;
        }else if(posicao === 0){
            inserted.next = this.#head
            this.#head = inserted

        }else if(posicao >= this.#count){
            this.#tail.next = inserted
            this.#tail = inserted
            console.log('maior que count')
        }else{
            let before = this.#head
            console.log('no meio')
            for(let i = 1; i < posicao; i++){
                console.log('passou')

                before = before.next
            }
            let after = before.next

            inserted.next = after

            before.next = inserted
            
        }

        this.#count++;
    }
    insertHead(valor){
        this.insert(0, valor)
    }
    insertTail(valor){
        this.insert(this.#count, valor)
    }
    remove(pos){
        //1°Caso caso vazia ou não tem a posição
        if(this.isEmpty || pos < 0 || pos > this.#count - 1){
            return undefined
        }
        let removed 
        //2°caso remover inicio da lista

        if(pos === 0){
            this.#head = this.#count.
        }
    }
}

const teste = new LinkedList()
teste.insert(0,6)
teste.insert(1,5)
teste.insert(2,2)
teste.insert(3, 7)
teste.insert(1, 7)
teste.insert(2, 7)