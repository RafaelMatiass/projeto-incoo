package exe_eng_soft;

public class PasswordValidatorTest {

  private static PasswordValidator validator = new PasswordValidator();

  public static void main(String[] args) {
  System.out.println("Iniciando testes para o validador de senha...");

  testValidPassword();
  testShortPassword();
  testNoNumber();
  testNoSpecialCharacter();
  testNoUpperCase();
  testNullPassword();
  testEmptyPassword();
  testOnlyNumbersAndSpecialCharacters();
  testOnlyUpperCaseLettersAndNumbers();

  System.out.println("Testes concluídos!");
}

private static void testValidPassword() {
  boolean result = validator.isValid("Strong@123");
  System.out.println("testValidPassword: " + (result ? "SUCESSO" : "FALHA"));
}

private static void testShortPassword() {
  boolean result = validator.isValid("S@1a");
  System.out.println("testShortPassword: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testNoNumber() {
  boolean result = validator.isValid("Strong@Password");
  System.out.println("testNoNumber: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testNoSpecialCharacter() {
  boolean result = validator.isValid("Strong123");
  System.out.println("testNoSpecialCharacter: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testNoUpperCase() {
  boolean result = validator.isValid("weak@123");
  System.out.println("testNoUpperCase: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testNullPassword() {
  boolean result = validator.isValid(null);
  System.out.println("testNullPassword: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testEmptyPassword() {
  boolean result = validator.isValid("");
  System.out.println("testEmptyPassword: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testOnlyNumbersAndSpecialCharacters() {
  boolean result = validator.isValid("1234@#$%");
  System.out.println("testOnlyNumbersAndSpecialCharacters: " + (!result ? "SUCESSO" : "FALHA"));
}

private static void testOnlyUpperCaseLettersAndNumbers() {
  boolean result = validator.isValid("PASSWORD123");
  System.out.println("testOnlyUpperCaseLettersAndNumbers: " + (!result ? "SUCESSO" : "FALHA"));
}
}
