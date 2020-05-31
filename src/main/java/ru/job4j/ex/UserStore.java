package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User x : users) {
            if (x.getUsername().equals(login)) {
                rsl = x;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("The User doesn't exist.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if ((user == null) || (!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("The User isn't valid.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Peter", true)
        };
        try {
            User user = findUser(users, "Peter");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException ef) {
            ef.printStackTrace();
        }
    }

}