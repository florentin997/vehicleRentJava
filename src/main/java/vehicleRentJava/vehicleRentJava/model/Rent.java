package vehicleRentJava.vehicleRentJava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rent {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Date StartDate;
    @Column
    private Date EndDate;
    @Column
    private float Kilometers;
    @Column
    private String PersonalIdentificationNumber;
    @Column
    private String RegistrationNumber;

    public Rent(Long id, Date startDate, Date endDate, float kilometers, String personalIdentificationNumber, String registrationNumber) {
        this.id = id;
        this.StartDate = startDate;
        this.EndDate = endDate;
        this.Kilometers = kilometers;
        this.PersonalIdentificationNumber = personalIdentificationNumber;
        this.RegistrationNumber = registrationNumber;
    }

    public Rent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public float getKilometers() {
        return Kilometers;
    }

    public void setKilometers(float kilometers) {
        Kilometers = kilometers;
    }

    public String getPersonalIdentificationNumber() {
        return PersonalIdentificationNumber;
    }

    public void setPersonalIdentificationNumber(String personalIdentificationNumber) {
        PersonalIdentificationNumber = personalIdentificationNumber;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", Kilometers=" + Kilometers +
                ", PersonalIdentificationNumber='" + PersonalIdentificationNumber + '\'' +
                ", RegistrationNumber='" + RegistrationNumber + '\'' +
                '}';
    }
}
