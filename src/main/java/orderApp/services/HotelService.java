package orderApp.services;

import orderApp.domain.OrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orderApp.repository.HotelRepository;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    public OrderData createOrder (OrderData order){
           return hotelRepository.save(order);
    }
}