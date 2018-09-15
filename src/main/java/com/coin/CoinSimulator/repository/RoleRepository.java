package com.coin.CoinSimulator.repository;
import com.coin.CoinSimulator.model.Role;
import com.coin.CoinSimulator.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
