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
    public void createUsers() {

        User user1 = new User("name", "lastName", "middleName", (byte) 12, "street","2a", PhoneNumber.isValidPhoneNumber("89859308388"));

        userService.createUser(user1);

        userService.getAllUsers().forEach(user -> {
            System.out.println("User: " + user.getFirstName() + " " + user.getLastName());
        });
    }
}