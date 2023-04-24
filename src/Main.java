public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="Black";
        audi.model = "A3";
        audi.power="5000cc";

        Engine x =new Engine();
        x.cylender="8";
        x.size="124cc";
        x.weight="6554kg";


        
        color col=new color();
        col.colorLight="true";
        col.colorTyre="false";
        col.colorWindows="true";


        lights neon=new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="5000lm";

    }
}