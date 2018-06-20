package code.Myutil;

public class UserAccess {
    // simple validation for user name and password
    public static boolean accessCheck(String userName, String password) {
        if (userName.length() <= 4 || userName.length() > 8)
            return false;
        if (password.length() <= 4 || password.length() > 8)
            return false;
        if (userName.contains("@"))
            return false;
        if (password.contains("*"))
            return false;
        return true;
    }
}
