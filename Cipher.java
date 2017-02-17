import java.security.*;

public abstract class Cipher {
  private SecureRandom random;

  public Cipher() {
    random = new SecureRandom();
  }

  public String hash(String plainPassword) {
    String salt = getNextSalt();
    return unsaltedHash(plainPassword + salt) + salt;
  }

  protected abstract String unsaltedHash(String plainPassword);

  public boolean verify(String plainPassword, String hashedPassword) {


    String salt = hashedPassword.charAt(hashedPassword.length() - 2)
                + "" + hashedPassword.charAt(hashedPassword.length() - 1);

    plainPassword = plainPassword + salt;

    return hashedPassword.equals(unsaltedHash(plainPassword)+salt);
  }

  protected String getNextSalt() {
    byte bytes[] = new byte[2];
    random.nextBytes(bytes);

    return new String(bytes);
  }
}
