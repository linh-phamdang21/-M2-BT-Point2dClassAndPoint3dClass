public class Point3D extends Point2D {
    private float z;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrXYZ = {this.getX(), this.getY(), this.z};
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + this.getX() +
                " y= " + this.getY() +
                " z=" + z +
                '}';
    }
}
