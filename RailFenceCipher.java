import java.util.*;

public class RailFenceCipher extends Cipher {
  public String unsaltedHash(String plainPassword) {
    String hashedPassword = new String();

    for (int i = 0; i < plainPassword.length(); i = i + 4) {
      hashedPassword = hashedPassword + plainPassword.charAt(i);
    }

    for (int i = 1; i < plainPassword.length(); i = i + 2) {
      hashedPassword = hashedPassword + plainPassword.charAt(i);
    }

    for (int i = 2; i < plainPassword.length(); i = i + 4) {
      hashedPassword = hashedPassword + plainPassword.charAt(i);
    }

    return hashedPassword;

  }
}
