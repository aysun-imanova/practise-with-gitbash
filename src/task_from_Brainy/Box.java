package task_from_Brainy;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(Box obj) {
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    public Box(double length) {
        width = height = depth = length;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

}
