package com.example.alt.altchecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    
    public static List<User> getNewUser(String fileUri) {
        List<User> uList = new ArrayList<User>();
        try (Scanner input = new Scanner(new File(fileUri) ) ) {
            while(input.hasNextLine()) {
                String str = input.nextLine();
                String[] filterStringUser = str.split("\\|")[0].split(":");
                User user = new User(filterStringUser[0],filterStringUser[1]);
                uList.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return uList;
    }
}
