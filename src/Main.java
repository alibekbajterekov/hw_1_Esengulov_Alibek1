public class Main {
    public static void main(String[] args) {
        Roof roof = new Roof(false);
        Floors floors = new Floors
                (1,ColorEnum.GREEN,roof,15,3);
        System.out.println(floors.getInfo());
        floors.intercomCode(123);

        System.out.println("--------------------");

        Roof roof2 = new Roof(true);
        Apartments apartments = new Apartments
                (2,ColorEnum.BLACK,roof2,36,5,15);
        System.out.println(apartments.getInfo());
        apartments.intercomCode();
        apartments.bell("Dzin Dzin");

        System.out.println("--------------------");

        Roof roof3 = new Roof(false);
        Apartments apartments2 = new Apartments
                (3,ColorEnum.BROWN,roof,40,8,25);
        System.out.println(apartments2.getInfo());
        apartments2.intercomCode(45);
        apartments.bell();



    }
}