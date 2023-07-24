public class Main {
    public static void main(String[] args) {

        System.out.println("Company = " + Emp.company);

        Emp e1 = new Emp(101, "AA", 1000);
        Emp e2 = new Emp(202, "BB", 2000);
        Emp e3 = new Emp(303, "CC", 3000);

        e1.display();
        e2.display();
        e3.display();

        System.out.println();
        e1.setCompany("BitCode Tech");
        e1.display();
        e2.display();
        e3.display();
    }
}
