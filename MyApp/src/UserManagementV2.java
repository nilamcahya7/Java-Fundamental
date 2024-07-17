import dataStatic.Data;

public class UserManagementV2 {
  public static void main(String[] args) {
    String[] check = login("nilam.cahya", "134");
    for (String result : check) {
      System.out.println(result);
    }
  }

  public static String[] login( String username, String password) {
    String[] checkUser = new String[1];
    for (int i = 0; i < Data.arrUsername.length; i++) {
      if (Data.arrUsername[i] == (username) && Data.arrPassword[i] == (password)) {
        checkUser[0] = username;
        return checkUser;
        } else{
          checkUser[0] = "Login Failed!";
        }
      }
    return checkUser;
  }
}
