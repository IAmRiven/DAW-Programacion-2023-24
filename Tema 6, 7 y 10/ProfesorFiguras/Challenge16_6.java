
import java.awt.Color;
import java.util.ArrayList;

public class Challenge16_6 {
    public static void main(String[] args) {
        ArrayList<GeometricalFigure> figures = new ArrayList<>();
        figures.add(new Rectangle(Color.BLUE, 20, 50, 100, 30));
        figures.add(new Rectangle(Color.RED, 20, 100, 100, 30));
        figures.add(new Line(Color.YELLOW, 20, 120, 60, 120));
        figures.add(new Line(Color.ORANGE, 20, 130, 60, 130));

        for (GeometricalFigure figure : figures) {
            figure.print();
        }

    }

}
