package app.repositories;

import app.entities.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepo extends JpaRepository<Merchant, Long> {

   Merchant findByUserUserId (Long userId);

    @Override
    <S extends Merchant> S save(S s);
}
