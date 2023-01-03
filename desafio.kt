// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)


enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        for (user in usuario) {
            inscritos.add(user)
        }

        println(this.toString())
        println(inscritos.joinToString())
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Kotlin", 120)
    val conteudo2 = ConteudoEducacional("JAVA")
    val formacao1 = Formacao("Bebe dev", listOf(conteudo1, conteudo2), Nivel.BASICO)

    val usuario = Usuario("Airton")
    val usuario2 = Usuario("Suelen")
    val usuario3 = Usuario("Outro")

    formacao1.matricular(usuario, usuario2, usuario3)
}
