package it.develhope.encapsulation;

public class House
{
    public int floorNumbers;
    public String address;
    public void setAddress(String address)
    {
        this.address=address;
        address="Via Rivalta 12";
    }
    public void setFloorNumbers(int floorNumbers)
    {
        this.floorNumbers=floorNumbers;
    }
    public void residentNames(String array, String jhon, String lucy, String peter)
    {
        residentNames("paul","Jhon","Lucy","Larry");
    }
    public int getFloorNumbers()
    {
        return floorNumbers;
    }
    public String getAddress()
    {
        return address;
    }
}
