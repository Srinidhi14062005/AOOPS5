package com.banking;

public class LoginStateManager {
	private static LoginStateManager singleInstance = null;
    private boolean isLoggedIn;
    private LoginStateManager() {
        isLoggedIn = false; 
    }

    public static LoginStateManager getInstance() {
        if (singleInstance == null) {
            synchronized (LoginStateManager.class) {
                if (singleInstance == null) {
                    singleInstance = new LoginStateManager();
                }
            }
        }
        return singleInstance;
    }

    public void login() {
        isLoggedIn = true;
    }

    public void logout() {
        isLoggedIn = false;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

}

