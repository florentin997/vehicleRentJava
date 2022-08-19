package vehicleRentJava.vehicleRentJava.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicleRentJava.vehicleRentJava.model.Rent;
import vehicleRentJava.vehicleRentJava.repository.RentRepository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Properties;

@RestController
public class RentRest {

    @Autowired
    private RentRepository rentRepository;

//    @GetMapping(path="/basepath/test")
//    public String testMethod(){
//        return "Hello world";
//}

    @GetMapping(path="/vehiclesrent/count")
    public Long countStudents(){
        return rentRepository.getNumberOfRents();
    }

    @PostMapping(path = "/vehiclesrent/postRent")
    public void createRent(@RequestBody Rent rent){
        System.out.println("@@@ Rent: " + rent);

        rentRepository.save(rent);
    }

    @GetMapping(path = "/vehiclesrent/allRentedVehicles")
    public List<Rent> getAllRents(){
        return rentRepository.findAll();
    }

    @GetMapping(path = "/vehiclesrent/allRentedVehiclesByPersonIdNumber")
    public List<Rent> getAllRentsForPersonIdNumber(@RequestParam(name = "personal_identification_number") String personalIdNumber){
        return rentRepository.findAllByPersonalIdentificationNumber(personalIdNumber);
    }
}
