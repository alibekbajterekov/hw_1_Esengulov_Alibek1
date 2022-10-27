public class Home {
    private int houseNumber;
    private ColorEnum color;
    private Roof door;
    private int amountApartments;


    public Home(int houseNumber, ColorEnum color, Roof door, int amountApartments) {
        this.houseNumber = houseNumber;
        this.color = color;
        this.door = door;
        this.amountApartments = amountApartments;
    }



    public int getAmountApartments() {
        return amountApartments;
    }

    public ColorEnum getColor() {
        return color;
    }

    public Roof getDoor() {
        return door;

    }
    public String getInfo(){
        return  "House number: " + houseNumber +
                "\nHouse color: " + color +
                "\nRoof door: " + (door.isDoor() ? "Door is open!" : "Door is closed!") +
                "\nNumber of apartments: " + amountApartments;
    }
}