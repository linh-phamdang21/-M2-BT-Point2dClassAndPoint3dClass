public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(20,20);
        System.out.println(point2D);
        System.out.println(point2D.getXY());

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(point3D.getXYZ());
    }
}
