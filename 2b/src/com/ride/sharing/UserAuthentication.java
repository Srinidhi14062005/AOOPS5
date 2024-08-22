package com.ride.sharing;


public class UserAuthentication {
 private static UserAuthentication instance;

 private UserAuthentication() {

 }

 public static synchronized UserAuthentication getInstance() {
     if (instance == null) {
         instance = new UserAuthentication();
     }
     return instance;
 }

 public void authenticate(String username, String password) {
   
     if ("user".equals(username) && "password".equals(password)) {
         System.out.println("User authenticated successfully.");
     } else {
         System.out.println("Authentication failed.");
     }
 }
}

