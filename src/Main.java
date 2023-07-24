public class Main {
    public static void main(String[] args) {

        System.out.println("Company = " + Emp.getCompany());

        Emp e1 = new Emp(101, "AA", 1000);
        Emp e2 = new Emp(202, "BB", 2000);
        Emp e3 = new Emp(303, "CC", 3000);


        //e1.getCompany();

        e1.display();
        e2.display();
        e3.display();

        System.out.println();
        Emp.setCompany("BitCode Tech");

        e1.display();
        e2.display();
        e3.display();
    }
}
