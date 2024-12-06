package dika.database.service;

import dika.database.model.User;
import dika.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    // Create user
    public User createUser(String name, String lastName, String middleName, byte age, String street, char[] homeNumber, String phoneNumber) {
        User user = new User(name, lastName, middleName, age, street, homeNumber, phoneNumber);
        return userRepository.save(user);
    }

    // Get user by id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Update user
    public User updateUser(Long id, User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setFirstName(userDetails.getFirstName());
            user.setLastName(userDetails.getLastName());
            user.setMiddleName(userDetails.getMiddleName());
            user.setStreet(userDetails.getStreet());
            return userRepository.save(user);
        }

        return null;
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
