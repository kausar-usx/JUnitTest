package com.labpbm.junittest

object RegistrationUtil {

    private val existingUsers = listOf("Kausar" , "Mirai")

        // deklarasi username dan password string
    fun validRegistrationInput(
        userName : String,
        password : String,
        confirmPassword : String
    ) : Boolean {
        // ketika password kosong return false
        if (userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        // username dari user sebelumnya return false
        if (userName in existingUsers){
            return false
        }
        // password tidak sama return false
        if (password != confirmPassword){
            return false
        }
        // password kurang dari 2 digit return false
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}
