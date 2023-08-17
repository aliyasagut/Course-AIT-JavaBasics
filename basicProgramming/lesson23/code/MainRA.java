public class MainRA {
    public static void main(String[] args) {
        RubberArrayString rubberArrayString = new RubberArrayString();
        rubberArrayString.add("Hallo");
        String s = new String("World");
        rubberArrayString.add(s);
        rubberArrayString.printArray();
    }
}
