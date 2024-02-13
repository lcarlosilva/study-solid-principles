package br.com.luiz.solid.example.ai.srp

/**
 * Aqui está sendo apresentado o princípio da responsabilidade única (SRP - Single Responsability Principle)
 * - O principio da responsabilidade unica afirma, que uma classe deve ter apenas uma razão para ser mudada.
 * Isso significa que uma classe deve ter apenas um trabalho ou responsabilidade;
 * */

// ANTES DO SRP
class UserSettings(private val user: User) {

    fun changeEmail(newEmail: String) {
        if (checkAccess(user)) {
            // Codigo para atualizar o e-mail do usuario
            user.email = newEmail
            // Codigo para enviar e-mail de confirmação
        }
    }

    private fun checkAccess(user: User): Boolean {
        // Verifica se o usuário tem acesso para mudar o e-mail
        return true
    }

}
// ANTES DO SRP
// ----------------------------------------------------
// DEPOIS DO SRP
class UserEmail(val user: User) {
    fun changeEmail(newEmail: String) {
        user.email = newEmail
    }
}

class EmailNotifier {
    fun sendConfirmationEmail(user: User) {
        // Codigo para enviar e-mail de confirmação
    }
}

class Security {
    fun checkAccess(user: User) : Boolean {
        return true
    }
}
// DEPOIS DO SRP

// ----------------------------------------------------

// Classe com responsabilidade única de representar um usuário
data class User(var email: String)

// ---------------------EXEMPLO PRATICO-------------------------------

// Classe com responsabilidade única de alterar o e-mail do usuário
class UserEmailChanger {
    fun changeEmail(user: User, newEmail: String) {
        user.email = newEmail
        println("Email changed to: ${user.email}")
    }
}

// Uso
fun main() {
    val user = User("old.email@example.com")
    val emailChanger = UserEmailChanger()
    emailChanger.changeEmail(user, "new.email@example.com")
}

// ---------------------EXEMPLO PRATICO-------------------------------

