package Main;

public class Rectangle {
    int x1, x2, y1, y2;

    public Rectangle() {

    }

    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Rectangle(int x1, int y1, float k) {
        this.x1 = x1;
        this.y1 = y1;
    }
    public Rectangle(int x1, float k, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
}
