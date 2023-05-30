// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val descricao: String)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
        }
    }
}

fun main() {
    val usuario = Usuario("José", "jose@email.com", 25)
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120, "Aprenda os conceitos básicos do Kotlin.")
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", 180, "Aprofunde seus conhecimentos em Kotlin.")
    
    val formacao = Formacao("Formação Kotlin", mutableListOf(conteudo1, conteudo2))
    formacao.matricular(usuario)
    
    println("Usuários inscritos na formação:")
    for (u in formacao.inscritos) {
        println(u.nome)
    }
}