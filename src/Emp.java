public class Emp {
    private final int id;
    private String name;
    private int sal; //instance members
    private static String company = "BitCode"; //class(static) variables

    public Emp(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public static String getCompany() {
        return company;
    }

    //static functions can access only static data members
    public static void setCompany(String company) {
        Emp.company = company;
    }

    //non-static function can access non-static(instance) members as well as static members
    //non-static function can access non-static(instance) members
    // because it is called on an object and hence receives this
    public void display() {
        System.out.println(id  + " " + name + " " + sal + " " + company);
    }
}
