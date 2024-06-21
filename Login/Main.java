package Login;

public class Main {
    public static void main(String[] args) {
        IDandPasswords iDandPasswords = new IDandPasswords();
        new LoginPage(iDandPasswords.getLoginInfo());
    }
}
