class Persona {
    int edad = 20
    int altura = 170
    int peso = 80
    String nombre = 'Juan'

    def increaseAge(int years) { 
        this.edad += years
    }
    def comer() {
        this.peso+=1
    }

    def cagar(int kilos){
        this.peso-=kilos
    }

}

