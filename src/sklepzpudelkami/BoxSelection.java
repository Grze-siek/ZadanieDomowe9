package sklepzpudelkami;

public class BoxSelection {
    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        boxes[0] = new Box(new CylinderShape(20,30));
        boxes[1] = new Box(new CylinderShape(15, 10));
        boxes[2] = new Box(new CuboidShape(10,10,20));
        boxes[2] = new Box(new CuboidShape(30,15,25));
    }

    public Box[] boxSelection(Product product, Box[] boxes) {
        for (Box box : boxes) {
            if(box.boxShape == product.productShape) {
                choosePerfectBox(product, box);
                break;
            }
        }
        return boxes;
    }

    private void choosePerfectBox(Product product, Box box) {
        boolean heightCondition = product.productShape.getHeight() < box.boxShape.getHeight();
      //  boolean lengthCondition = product.((CuboidShape)productShape).getLength() < box.boxShape.getHeight();
       // boolean heightCondition = product.productShape.getHeight() < box.boxShape.getHeight();

    }
}
