class CalculateArea {
    void Area(float r) {
        float a = 3.14f * r * r;
        System.out.println("Area of circle is " + a);
    }

    void Area(int l, int b) {
        int area = l * b;
        System.out.println("Area of rectangle is " + area);
    }

    void Area(float h, float b) {
        float area = 0.5f * h * b;
        System.out.println("Area of triangle is " + area);
    }

    public static void main(String[] args) {
        CalculateArea x = new CalculateArea();
        x.Area(3);
        x.Area(3.5f, 4.5f);
        x.Area(2.0f, 3.0f);
    }
}
