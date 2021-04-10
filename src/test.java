public class test {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(5,7,2,2);
        System.out.println(point.toString());
        System.out.println(point.move().toString());
    }
}
