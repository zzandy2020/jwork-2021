package W01.王鹏191220112;

public class Entity extends Being {

    int status;

    public Entity(String name) {
        super(name);
    }

    public void open() {
        System.out.println("I open. ");
    };

    public void shine() {
        System.out.println("I shine. ");
    };
}
