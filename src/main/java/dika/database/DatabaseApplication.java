package dika.database;

import dika.database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseApplication {

    private static final UserService userService = null;

    public static void main(String[] args) {

        System.out.println(PhoneNumber.isValidPhoneNumber("89859308388"));
        Scan scanner = new Scan();
        userService.createUser(scanner.scan(), scanner.scan(), scanner.scan(), Byte.parseByte(scanner.scan()), scanner.scan(), scanner.scan().toCharArray(), PhoneNumber.isValidPhoneNumber(scanner.scan()));
        SpringApplication.run(DatabaseApplication.class, args);
    }

}
