package com.example.alt.altchecker;

import java.util.List;

public class AltController {

    private String fileUri = null;

    public AltController(String fileUri) {
        this.fileUri = fileUri;
    }

    public void hitApis() {
        List<User> userList = Utils.getNewUser(fileUri);
        for (User user : userList) {
            ApiList.hitAltBalajiApi(user);
        }
    }
}
