package binarysearchAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {



    @Test
    void caesarEncryptTest() {
        CaesarCipher caesarCipher = new CaesarCipher();
        // given
        String textToEncrypt = "Encrypt this text";

        // when
        String cipherText = caesarCipher.encode(textToEncrypt, 5);

        // then
        assertEquals("Jshwduy ymnx yjcy", cipherText);
    }

    @Test
    void caesarDecryptTest() {
        CaesarCipher caesarCipher = new CaesarCipher();
        // given
        String encryptedText = "Jshwduy ymnx yjcy";

        // when
        String cipherText =  caesarCipher.decode(encryptedText, 5);

        // then
        assertEquals("Encrypt this text", cipherText);
    }

    @Test
    void caesarBruteForce() {
        CaesarCipher caesarCipher = new CaesarCipher();
        // given
        String encryptedText = "Jshwduy ymnx yjcy";

        // when
        String[] allPossibleAnswers = caesarCipher.bruteforce(encryptedText);

        assertEquals(27, allPossibleAnswers.length);
        assertEquals("Encrypt this text", allPossibleAnswers[5]);
    }
}


