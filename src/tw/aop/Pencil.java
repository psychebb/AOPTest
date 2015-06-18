package tw.aop;

public class Pencil implements Draw {
    private String color;

    public Pencil(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.println("color pencil paints");
    }
}
