package service.ServiceAble;

import enums.Gender;
import model.Book;
import model.User;
import service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.swap;

public class UserServiceAble implements UserService {
    private final List<User> user = new ArrayList<>();

    @Override
    public String createUser(List<User> users) {
        this.user.addAll(users);
//        System.out.println("write ID user");
//        Long id = new Scanner(System.in).nextLong();
//        System.out.println("write name user");
//        String userName = new Scanner(System.in).nextLine();
//        System.out.println("write SurName user");
//        String surName = new Scanner(System.in).nextLine();
//        System.out.println("write email user");
//        String email = new Scanner(System.in).nextLine();
//        System.out.println("write Phone number user");
//        String phoneNumber = new Scanner(System.in).nextLine();
//        System.out.println("write Gender user");
//        Gender gender = enums.Gender.valueOf(new Scanner(System.in).nextLine());
//        System.out.println("write money user");
//        BigDecimal money = new Scanner(System.in).nextBigDecimal();
//        users.add(new User(id,userName,surName,email,phoneNumber,gender,money,new ArrayList<>()));
        return "account user created";
    }

    @Override
    public List<User> findAllUsers() {
        return this.user;
    }

    @Override
    public User findUserById(Long id) {
        for (User user1 : user) {
            if (user1.getId().equals(id)) {
                System.out.println(user1);
            }
        }

        return (User) user;
    }

    @Override
    public String removeUserByName(String name) {
        user.removeIf(user1 -> user1.getName().equals(name));
        return "successfully reomv";
    }

    @Override
    public void updateUser(Long id) {
        System.out.println("write word what you wont replace");
        System.out.println("""
                press 1 to replace id
                press 2 to replace name
                press 3 to replace surname""");
        int str = new Scanner(System.in).nextInt();
        for (User user1 : user) {
            if (user1.getId().equals(id))
            switch (str) {
                case 1:
                    System.out.println("write id");
                    Long l = new Scanner(System.in).nextLong();
                        user1.setId(l);
                    break;
                case 2:
                    System.out.println("write id name");
                    String names = new Scanner(System.in).nextLine();
                    user1.setName(names);
                    break;
                case 3:
                    System.out.println("write surname");
                    String surName = new Scanner(System.in).nextLine();
                    user1.setSurname(surName);
                    break;
                case 4:
                    System.out.println("write email");
                    String email = new Scanner(System.in).nextLine();
                    user1.setEmail(email);
                    break;
                case 5:
                    System.out.println("write phone number");
                    String phoneNumber = new Scanner(System.in).nextLine();
                    user1.setPhoneNumber(phoneNumber);
                    break;

            }
        }
    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
