package dio.me.spring_boot_api_rest_railway.service.impl;

import dio.me.spring_boot_api_rest_railway.domain.model.User;
import dio.me.spring_boot_api_rest_railway.domain.repository.UserRepository;
import dio.me.spring_boot_api_rest_railway.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate){
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
