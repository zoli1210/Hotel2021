package repository;

import domain.OrderData;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface HotelRepository extends CrudRepository<OrderData,Long> {
    @Override
    List<OrderData> findAll();
}
