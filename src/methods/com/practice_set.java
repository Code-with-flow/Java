package methods.com;


class tommy {
    public void hit() {
        System.out.println("hitting the enemy");
    }
    public void fire() {
        System.out.println("firing the enemy");
    }
    public void rum() {
        System.out.println("running the enemy");
    }

}

public class practice_set {
    public static void main(String[] args) {

        tommy vercetti = new tommy();
        vercetti.fire();
        vercetti.rum();
        vercetti.hit();



    }
}
