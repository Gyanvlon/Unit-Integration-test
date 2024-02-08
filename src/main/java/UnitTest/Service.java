package UnitTest;

import lombok.Data;

@Data
public class Service {
    private EmailService emailService;
    private PassengerService passengerService;
    public void registerPassenger(String id){
        passengerService.setId(id);
        emailService.setId(id);}
}
