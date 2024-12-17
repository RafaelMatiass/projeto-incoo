package exe_eng_soft;

public class PasswordValidator {

 public boolean isValid(String password) {
    if (password == null){
      return false;
    }
    if (password.length() < 8){
      return false;
    }
    if (!password.matches(".*\\d.*")){
      return false;
    }
    if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")){
      return false;
    }
    if (!password.matches(".*[A-Z].*")){
      return false;
    }
    return true;
 }
}
