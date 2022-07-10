public class Director extends Manager{

    public int getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }

}
