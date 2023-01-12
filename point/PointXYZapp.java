package gr.aueb.cf.exercisesch11oop.point;

public class PointXYZapp {

    public static void main(String[] args) {
        PointXYZ pointXYZ = new PointXYZ(10,20,30);
        PointXYZ pointXYZ1 = new PointXYZ();

        pointXYZ1.setX(15);
        pointXYZ1.setY(29);
        pointXYZ1.setZ(18);

        System.out.println(pointXYZ.convertToString());
        System.out.println(pointXYZ1.convertToString());

    }
}
