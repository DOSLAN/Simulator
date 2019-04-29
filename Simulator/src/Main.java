import java.util.Scanner;
import javax.swing.JFrame;
public class Main
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        camera.init(0 ,0 ,300);
        int[] cameraGetCoordinates = camera.getCoordinates();
        int CAMX = cameraGetCoordinates[0];
        int CAMY = cameraGetCoordinates[1];
        int CAMZ = cameraGetCoordinates[2];


        JFrame frame = new JFrame("Drawing triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Triangle triangle = new Triangle();
        triangle.init( 0,0,0,0,0,-200,200,0,0, 0,0 , 0 , CAMX , CAMY , CAMZ);
        int[] triangleGetCentroid = triangle.getCentroid();
        frame.add(triangle);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}

