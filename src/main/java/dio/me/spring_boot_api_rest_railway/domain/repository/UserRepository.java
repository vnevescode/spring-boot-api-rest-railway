package dio.me.spring_boot_api_rest_railway.domain.repository;

import dio.me.spring_boot_api_rest_railway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);
}
