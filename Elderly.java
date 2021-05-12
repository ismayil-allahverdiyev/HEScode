public class Elderly extends Person {
    private boolean isVaccinated;

    public Elderly(String name, String lastName,int age, String hesCode) {
        super(name,lastName, age, hesCode);
        if(this.getAge()<=65){
            this.isVaccinated = false;
        }else {
            this.isVaccinated = true;
        }
        if(this.isVaccinated) {
            System.out.println("The person's HES code: " + hesCode + "\nS(he) is old enough to get vaccine.");
        }else{
            System.out.println("The person's HES code: " + hesCode + "\nS(he) is not old enough to get vaccine.");
        }
    }
}
