package sklepzpudelkami;

public class CuboidShape extends Shape{
    private int length;
    private int width;

    public CuboidShape(int height, int length, int width) {
        super(height);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
