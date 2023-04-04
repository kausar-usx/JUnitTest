import com.google.common.truth.Truth.assertThat
import com.labpbm.junittest.RegistrationUtil
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        // tes untuk mengaktifkan function
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "123",
            "123"
        )
        // assertThat() dari truth library
        assertThat(result).isFalse()
    }

    // username dan pass benar returns true
    @Test
    fun `username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Kausar",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    // nama yang sudah dipakai return false
    @Test
    fun `username already taken returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Mirai",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    // password tidak sama return false
    @Test
    fun `incorrect confirm password returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Kausar",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    // test jika password kurang dari 2 digit
    @Test
    fun `less than two digit password return false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Mirail",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()
    }
}
