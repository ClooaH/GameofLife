public class God {

    private int Width = 1;
    private int Height = 1;

    public God(int width, int height) {
        this.Width = width;
        this.Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    @Override
    public String toString() {
        return "God{" +
                " Width=" + Width +
                ", Height=" + Height + " " +
                '}';
    }
}
