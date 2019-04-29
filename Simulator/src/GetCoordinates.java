public class GetCoordinates {


    public double[] getCoordinates(int x , int y , int z , int CAMX , int CAMY , int CAMZ)
    {
        double ratio  = (CAMX*CAMX + CAMY*CAMY + CAMZ*CAMZ)/(CAMX*CAMX + CAMY*CAMY + CAMZ*CAMZ - CAMX*x - CAMY*y - CAMZ*z);
        double rX = ratio*(x - CAMX) + CAMX;
        double rY = ratio*(y - CAMY) + CAMY;
        double rZ = ratio*(z - CAMZ) + CAMZ;
        double c = Math.sqrt(1 + rZ*rZ/(rX*rX + rY*rY));
        double resultX = rX*c;
        double resultY = rY*c;
        double[] result = {resultX , resultY};
        return result;
    }
}