package za.ac.mkums.cput.OCP.violateOCP;

/**
 * Created by Songezo on 2016-03-24.
 */
public class CalculateArea_VvImpl implements CalculateArea_Vv {

    public String getShape() {
        return "Are of a Circle";
    }

    public String AreaChoice() {
        return null;
    }

    public String AreaChoice(int chc) {

        String msg = " ";
        if (chc == 1)
            msg = "radius * radius * PI";
        else
            msg = "width * height";
        return msg;
    }
}
