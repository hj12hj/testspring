package pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sp")
public class SuperPeople extends People{
    @Value("address")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "SuperPeople{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}