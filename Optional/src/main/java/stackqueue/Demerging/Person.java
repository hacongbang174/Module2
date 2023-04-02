package stackqueue.Demerging;

import java.util.Date;

public class Person {
    private String fullName;
    private String gender;
    private Date birthDay;

    public Person() {
    }

    public Person(String fullName, String gender, Date birthDay) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return fullName + ", " + gender + ", " + birthDay;
    }
}
