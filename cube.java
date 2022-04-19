import java.awt.Color;
public class cube{
    float width;
    float height;
    float density;
    float x;
    float y;
    float velx;
    float vely;
    float rotation;
    MyArrayList <point> points = new MyArrayList<>();

    public cube(float widthin, float heightin, float densityin, Color colorin, float xin, float yin, float rotationin){
        width = widthin;
        height = heightin;
        density = densityin;
        x = xin;
        y = yin;
        rotation = rotationin;
    }

    public void setPositionandvel(float xin, float yin, float velxin, float velyin){
        x = xin;
        y = yin;
        velx = velxin;
        vely = velyin;
    }



}