package Artists;
import Countries.Country;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Artist {
    public String name;
    public LocalDate dateOfBirth;
    public LocalDate dateOfDeath = null;
    public Country nationality;

    public Artist(String name, LocalDate dateOfBirth, Country nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    public Artist(String name, LocalDate dateOfBirth, LocalDate dateOfDeath, Country nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return ((int) ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now()));
    }
    @Override
    public String toString() {
        return " " + this.name + "\n" + "From " + this.nationality.getUrl() + "\n" +
                ((this.dateOfDeath == null) ?  "Age: " + getAge() : this.dateOfBirth + "\n" + this.dateOfDeath + "\n" + "Rest in Peace") + "\n";
    }

}
