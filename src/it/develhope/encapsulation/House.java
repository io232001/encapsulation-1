package it.develhope.encapsulation;

public class House
{
    private int floorsNumber;
    private String address;
    private String residentsNames;
    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
    public int getFloorsNumber() {
        return floorsNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setResidentsNames(String residentsNames) {
        this.residentsNames = residentsNames;
    }
    public String getResidentsNames() {
        return residentsNames;
    }

}
