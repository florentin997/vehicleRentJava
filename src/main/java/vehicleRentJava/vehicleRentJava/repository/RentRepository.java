package vehicleRentJava.vehicleRentJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vehicleRentJava.vehicleRentJava.model.Rent;

import java.util.List;

public interface RentRepository  extends JpaRepository<Rent,Long> {

    @Query(value = "SELECT count(vr) from Rent vr")
    public Long getNumberOfRents();

    //find all rented vehicles by personalIdNumber
    @Query("SELECT r FROM Rent r WHERE r.PersonalIdentificationNumber = :personalIdNumber") //fara linia de Query data explicit nu functioneaza metoda
    public List<Rent> findAllByPersonalIdentificationNumber(String personalIdNumber);

    public List<Rent> findAll();
}
