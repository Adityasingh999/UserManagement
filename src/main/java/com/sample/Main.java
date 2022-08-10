package com.sample;

import com.sample.models.User;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        UserManager userManager = new InMemoryStorageUserManager();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        User user = new User();
        int i = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.UPDATE");
            System.out.println("5.DELETE");
            System.out.println("6.EXIT");

            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter User Id:");
                    user.setId(s.nextInt());
                    System.out.print("Enter User name:");
                    user.setName(s1.nextLine());
                    userManager.addUser(user);
                    break;
                case 2:
                    userManager.listUsers();
                    break;
                case 3:
                    System.out.println("SEARCH USERNAME");
                    userManager.searchUsers("aditya");
                    break;
                case 4:
                    User newUser=new User();
                    System.out.println("UPDATE USERNAME");
                    newUser.setId(1);
                    newUser.setName("ABHINAV");
                    userManager.updateUser(newUser);
                    break;
                case 5:

                    System.out.println("DELETE USERId");
                    int id=s.nextInt();
                    userManager.deleteUser(id);
                    break;
                case 6:
                    System.out.println("EXIT");
                    break;

            }


        } while (i != 6);
    }


}
