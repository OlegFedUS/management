public class Main {

    public static void main(String[] args){

        Director directorSalary = new Director();

        directorSalary.setBaseSalary(25000);
        directorSalary.setNumberOfSubordinates(100);
        System.out.println(directorSalary.getSalary());


        Manager managerSalary = new Manager();

        managerSalary.setBaseSalary(75225);
        managerSalary.setNumberOfSubordinates(225);
        System.out.println(managerSalary.getSalary());


    }
}
