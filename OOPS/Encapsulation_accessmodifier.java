package OOPS;

class Student {
    private String name; // default access modifier if not private
    private int reg_no;
    private String password; // we can also use private for password to hide it from other classes  

    void set(String name, int reg_no){
        this.name = name;
        this.reg_no = reg_no;
    }
    private void setPassword(String password){
        this.password = password;
    }
    void setloginDetails(String name, int reg_no, String password){
        set(name, reg_no);
        setPassword(password);
    }
    String getPassword(){
        return password;
    }

    void setValue(String n, int r) { //setMethod or setter method to set the value of the private variables
        name = n;
        reg_no = r;
    }

    String getName() { //getMethod or getter method to retrieve the value of the private variables
        return name;
    }

    int getRegNo() {
        return reg_no;
    }
}

public class Encapsulation_accessmodifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set("Santhosh", 12345);
        System.out.println(s1.getName());
        s1.setloginDetails("Santhosh", 12345, "password123");

        System.out.println(s1.getName() + " " + s1.getRegNo());
    }
}