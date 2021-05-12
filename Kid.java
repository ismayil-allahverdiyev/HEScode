public class Kid extends Person {
    private boolean gender;
    public Kid(String name, String lastName, String hesCode, boolean gender){
        super(name, lastName, hesCode);
        this.gender = gender;

        if(gender) {
            System.out.println(name + " " + lastName + " is a male Kid and HIS Hes code: " + hesCode);
        }else {
            System.out.println(name + " " + lastName + " is a female Kid and HIS Hes code: " + hesCode);
        }
    }


}
