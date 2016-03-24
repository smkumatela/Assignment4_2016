package za.ac.mkums.cput.domain;

/**
 * Created by Songezo on 2016-03-13.
 */
public class StdInfo_Encapsulation {

    private String surname;
    private String stdNumber;
    private String yearOfStudy;

    public StdInfo_Encapsulation() {
    }

    public StdInfo_Encapsulation(String surname, String stdNumber, String yearOfStudy) {
        this.surname = surname;
        this.stdNumber = stdNumber;
        this.yearOfStudy = yearOfStudy;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStdNumber() {
        return stdNumber;
    }

    public void setStdNumber(String stdNumber) {
        this.stdNumber = stdNumber;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "StdInfo_Encapsulation{" +
                "surname='" + surname + '\'' +
                ", stdNumber='" + stdNumber + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                '}';
    }
}
