public class P_13_Constructors {
    public static void main(String[] args) {
        myMainEmployee vedansh = new myMainEmployee();
        System.out.println(vedansh.getID());
        System.out.println(vedansh.getName());

        myMainEmployee srikrishna = new myMainEmployee(1);
        //System.out.println(srikrishna.id); // ID and Name variable have private access that why we can access through methods only.
        System.out.println(srikrishna.getID());
        System.out.println(srikrishna.getName());
    }
}

class myMainEmployee{
    private int id;
    private String name;  // these can be accessed through methods.

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int n){
        this.id = n;
    }
    public int getID(){
        return id;
    }
//EXAMPLE OF CONSTRUCTOR OVERLOADING:
    public myMainEmployee(){
        this.id = 0;
        this.name = "noName";
    }

    public myMainEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public myMainEmployee(int id){
        this.id = id;
        this.name ="ToBeUpdated";
    }

}
