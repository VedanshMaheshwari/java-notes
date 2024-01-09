class myEmployee{
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
}

public class P_12_AccessModif_GetterSetter {

    /*
    Access Modifiers:

    1. Private
    2. Default
    3. Protected
    4. Public
    */
    public static void main(String[] args){
        myEmployee vedansh = new myEmployee();
        //vedansh.id = 297;
        //vedansh.name = "Vedansh";  THROWS ERROR BECAUSE OF PRIVATE ACCESS MODIFIERS.

        vedansh.setName("Vedansh");
        System.out.println(vedansh.getName());

        vedansh.setId(297);
        System.out.println(vedansh.getID());
    }
}
