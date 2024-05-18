package methods.com;

class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.print("my id is " + id );
        System.out.println(" and my name is " + name);
    }
}
public class oops {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee tarun = new employee();
        tarun.id = 15;
        tarun.name = "code with tarun";
        tarun.printDetails();
//        System.out.println(tarun.id);
//        System.out.println(tarun.name);

    }
}
