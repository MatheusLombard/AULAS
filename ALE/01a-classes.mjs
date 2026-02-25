class FormaGeometrica{
    #base
    #altura
    #tipo

    // constructor(base, altura, tipo){
    //     this.#base = base;
    //     this.#altura = altura;
    //     this.#tipo = tipo;

    // }

    get base(){
        return this.#base
    }
    get altura(){
        return this.#altura
    }
    get tipo(){
        return this.#tipo
    }
    set base(valor){
        if(typeof valor !== Number || valor <= 0){
            throw new Error("Erro: a base precisa ser numéria e maior que zero")
        }
        this.#base = valor
    }

    set altura(valor){
        if(typeof valor !== Number || valor <= 0){
            throw new Error("Erro: a altura precisa ser numéria e maior que zero")
        }
        this.#altura = valor
    }

}