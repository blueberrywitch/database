package dika.database;

import dika.database.create.Create;
import dika.database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseApplication {

    private final UserService userService;

    public static void main(String[] args) {

        System.out.println(PhoneNumber.isValidPhoneNumber("89859308388"));
        Create create = new Create(userService);
        create.createUsers();
    }

}
