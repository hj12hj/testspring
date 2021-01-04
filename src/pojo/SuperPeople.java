package pojo;

import annoce.Super;

@Super
public class SuperPeople extends People{

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