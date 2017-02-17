import java.util.*;

public class CaesarCipher extends Cipher {
  protected String unsaltedHash(String plainPassword) {
    String hashedPassword = new String();

    int shift = 3;

    for (int i = 0; i < plainPassword.length(); i++) {

      char c = (char)(plainPassword.charAt(i) + shift);

      if (c > 'z')
        hashedPassword += (char)(plainPassword.charAt(i) - (26-shift));
      else
        hashedPassword += (char)(plainPassword.charAt(i) + shift);
    }

    return hashedPassword;
  }
}
