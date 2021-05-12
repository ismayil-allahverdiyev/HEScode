public class Parent extends Person {
    private String Kids[];
    private int numberOfKids;
    public Parent(String name, String lastName, int age, boolean gender, int numberOfKids) {
        super(name, lastName, age);
        Kids = new String[numberOfKids];
        this.numberOfKids = numberOfKids;


    }

    public Parent(String  hesCode, int maleCounter, int femaleCounter){
        super(hesCode);

        System.out.println("Parent's has HES code: " + hesCode + "\n" +
                "The parent has " + femaleCounter + " daughters and " + maleCounter + " sons.\n");
    }
}
