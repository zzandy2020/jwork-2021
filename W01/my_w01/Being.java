package W01.my_w01;

public class Being {
    //生物的姓名和坐标属性
    String name;
    int positionX;
    int positionY;

    public Being(String name, int x, int y){
        this.name = name;
        this.positionX = x;
        this.positionY = y;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getName(){
        return name;
    }
}
