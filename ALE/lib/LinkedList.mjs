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
            this.#head = inserted;
            this.#tail = inserted;
        }
        this.count++;
    }
}