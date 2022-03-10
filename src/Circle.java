public class Circle {
    /**
     * initialize intance variables
     */
    private double radius;
    private double pi = 3.14;
    /**
     * Circumference = 2 * pi * r
     * Area = pi * (r * r)
     */
    Circle(double inputRadius){
        radius = inputRadius;
    }

    public void setRadius(double rInput){
        this.radius = rInput;
    }
    public double getRadius(){
        return this.radius;
    }
    
    public double computeCircumference(){
        return radius * 2 * pi;
    }

    public double computeArea(){
        return pi * (radius * radius);
    }

    public static void main(String[] args) {
        double initRadius = 13.5;
        Circle c = new Circle(initRadius);
        System.out.println("Circumference " + c.computeCircumference());
        System.out.println("Area " + c.computeArea());
        Circle c2 = new Circle(110.56);
        System.out.println("Circumference " + c2.computeCircumference());
        System.out.println("Area " + c2.computeArea());
        
    }

}
