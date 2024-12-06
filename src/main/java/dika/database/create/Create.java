package dika.database.create;

import dika.database.PhoneNumber;
import dika.database.model.User;
import dika.database.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Create {

    private final UserService userService;

    @PostConstruct
    public void createUsers(String name, String lastName, String middleName, byte age, String street, char[] homeNumber, String phoneNumber) {

        User user1 = new User(name, lastName, middleName, age, street, homeNumber, PhoneNumber.isValidPhoneNumber(phoneNumber));

        userService.createUser(user1);

        userService.getAllUsers().forEach(user -> {
            System.out.println("User: " + user.getFirstName() + " " + user.getLastName());
        });
    }
}