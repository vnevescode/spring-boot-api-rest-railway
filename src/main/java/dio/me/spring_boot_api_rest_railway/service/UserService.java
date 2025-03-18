package dio.me.spring_boot_api_rest_railway.service;

import dio.me.spring_boot_api_rest_railway.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
