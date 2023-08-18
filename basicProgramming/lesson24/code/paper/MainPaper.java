package paper;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pencil pencil = new Pencil();
        Marker marker = new Marker();
        Brush brush = new Brush();
        Pen pen = new Pen();

        paper.drawFigureOnMe("round", pencil);
        paper.drawFigureOnMe("квадрат", brush);
        paper.drawFigureOnMe("треугольник", marker);
        paper.drawFigureOnMe("что-то", pen);
    }
}
