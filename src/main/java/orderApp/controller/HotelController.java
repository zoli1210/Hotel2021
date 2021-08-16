package orderApp.controller;

import orderApp.domain.OrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import orderApp.services.HotelService;

@RestController
@CrossOrigin
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/order")
    public ResponseEntity <OrderData> saveHotelController (@RequestBody OrderData order){
         OrderData orderData = hotelService.createOrder(order);
         return ResponseEntity.ok(orderData);
    }

}