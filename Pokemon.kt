fun main(){
    val charmander = Pokemon("charmander", 80, 5, 7, 40)
    val mew  = Pokemon("mew", 200, 70, 151, 100)

    charmander.atacar(mew, "placaje", 20)
}

class Pokemon(
    val nombre: String,
    var hp: Int,
    var nivel: Int,
    val id: Int,
    var atk: Int
){
    fun getName(): String{
        return nombre;
    }
    fun saltar(){
        println("el pokemon $nombre está saltando")
    }

    fun volar(){
        println("el pokemon $nombre comenzó a volar")
    }

    fun info(){
        println("HP: $hp \nNivel: $nivel \nATQ: $atk")
    }

    fun recibirDanio(danio: Int){
        println("el pokemon $nombre a recibido $danio puntos de daño")
        hp = hp - danio
        println("HP restante: $hp")
        if(hp < 0) {
            println("EL POKEMON SE HA DEBILITADO !!!")
        }
    }

    fun atacar(pokemonAtacado: Pokemon, nombreAtaque: String, danio: Int){
        println("$nombre ha atacado a utilizado $nombreAtaque sobre ${pokemonAtacado.getName()}")
        pokemonAtacado.recibirDanio(danio)
    }

}