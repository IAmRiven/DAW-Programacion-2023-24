
import java.awt.Point;

public class Line implements Comando {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void mover(int delta) {

        start.setLocation(start.getX() + delta, start.getY());
        end.setLocation(end.getX() + delta, end.getY());
    }

    @Override
    public void excute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excute'");
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }

}
