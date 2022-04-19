import java.awt.Color;
public class space {
    
    
    public static MyArrayList<cube> cubes= new MyArrayList<>();
    public static int amountofcubes = 0;
    public static float gravity = 10;
    public static float tickdelay = 10;
    
    
    public void addcube(float xin, float yin, float widthin, float heightin, float densityin, Color colorin, float rotationin){
        cubes.add(new cube(widthin, heightin, densityin, colorin, xin, yin, rotationin));
    }

    public static void gravity(cube c){
        
        //gets distance from center to corner
        double cornerdistance = Math.sqrt(Math.pow(c.width/2, 2) * Math.pow(c.height/2, 2));
        
        //get corners (starting at top right 0 radians is up)
        c.points.clear();
        for(int i = 1; i < 4; i++){
            c.points.add(new point(cornerdistance * Math.cos((Math.PI/2) * i + c.rotation) + c.x, cornerdistance * Math.sin((Math.PI/2) * i + c.rotation) + c.x));
            StdDraw.setPenColor(new Color(255,255,255));
            StdDraw.setPenRadius(100);
            StdDraw.point(c.points.get(i-1).x, c.points.get(i-1).y);
        }

        StdDraw.setPenColor(new Color(255,0,0));
        StdDraw.filledSquare(c.x, c.y, c.height/2);

        
    }
    
    
    public static void main(String[] args) {
        
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0,100);
        StdDraw.setYscale(0,100);
        StdDraw.setPenColor(new Color(20,255,40));
        StdDraw.filledRectangle(50, 5, 50, 5);

        cube cub = new cube(30f, 30f, 5f, new Color(255, 255, 0), 40f, 60f, 0f);
        gravity(cub);


        long lasttime = 0;
        while(true){
            if(System.currentTimeMillis() - lasttime > tickdelay){
                lasttime = System.currentTimeMillis();
                //StdDraw.clear();
                StdDraw.setPenRadius(10);
                StdDraw.setPenColor(new Color(20,255,40));
                StdDraw.filledRectangle(50, 5, 50, 5);
                
                //add gravity and move cubes
                for(int i = 0; i < cubes.size(); i++){

                }









                StdDraw.show();
            }





        }
    }
}
