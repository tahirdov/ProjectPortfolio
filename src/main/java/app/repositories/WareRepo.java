package app.repositories;

import app.entities.Ware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WareRepo extends JpaRepository<Ware, Long> {

    List<Ware> findAllByMerchantMerchantId (Long merchantId);

}
