package customers;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Customer {
    @JsonIgnore
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private int birthday;
    private String address;
    private long creditCardNumber;
    private double creditCardBalance;
    private static int tempID;

    public Customer(String surname, String name, String middleName, int birthday, String
            address, long creditCardNumber, double creditCardBalance) {
        tempID++;
        this.id=tempID;
        this.surname=surname;
        this.name=name;
        this.middleName=middleName;
        this.birthday=birthday;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.creditCardBalance = creditCardBalance;
    }

    public Customer(){
        this("","","",0,"", 0L,0.0);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName=middleName;
    }
    public int getBirthday(){
        return birthday;
    }
    public int setBirthday(){return birthday;}
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public long getCreditCardNumber(){
        return creditCardNumber;
    }
    public void setCreditCardNumber(long creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }
    public double getCreditCardBalance(){
        return creditCardBalance;
    }
    public void setCreditCardBalance(double creditCardBalance){
        this.creditCardBalance = creditCardBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(address, customer.address) &&
                customer.creditCardNumber == creditCardNumber &&
                Double.compare(customer.creditCardBalance, creditCardBalance) == 0 &&
                Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) &&
                Objects.equals(middleName, customer.middleName) &&
                customer.birthday==birthday;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, birthday, address, creditCardNumber, creditCardBalance);
    }

    @Override
    public String toString(){
        return "Customer{"+
                "id= "+id+
                ", name=' "+name+'\''+
                ", surname=' "+ surname+'\''+
                ", middleName=' "+middleName+'\''+
                ", yearOfBirth=' "+birthday+'\''+
                ", address= "+ address +'\''+
                ", creditCardNumber= "+ creditCardNumber +
                ", creditCardBalance= "+ creditCardBalance +
                '}';
    }
}