package Login;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();
    IDandPasswords() {
        loginInfo.put("denis0101", "1234");
        loginInfo.put("pro0101", "1234");
        loginInfo.put("men0101", "1234");
    }
    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
