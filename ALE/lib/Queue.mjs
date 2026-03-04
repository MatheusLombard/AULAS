export  default class Queue{
    #data //vetor privado
    constructor(valor){
        this.#data = valor || []
    }

    //METDODO PARA ADICIONAR
    enqueue(val){
        this.#data.push(val)
    }

    //MEDOTO PARA REMOVER DA FILA
    dequeue(){
        return this.#data.shift()
    }

    //METODO PARA CONSULTA O INICIO DA FILA SEM REMOVER O ELEMENTO
    peek(){
        return this.#data[0]
    }
    get isEmpty(){
        return this.#data.length === 0
    }

    //METODO PARA IMPRIMIR A FILA(EFEITOS DE DEPURAÇÃO)
    print(){
        let output = '[ \n'
        for(let i = 0; i < this.#data.length; i++){
            if(output !== "[ \n") output += ", \n";
            output += `(${i+1}): ${this.#data[i]}`

        }
        return output + ' \n]'
    
        
    }


}

const fila = new Queue()

fila.enqueue('Matheus')
fila.enqueue('Lucas')
fila.enqueue('Rafael')
fila.enqueue('Guilherme')
fila.enqueue('Mariana')

console.log(fila.print())

