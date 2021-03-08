public class simplecircle {
    double radius = 1;
    simplecircle(){
    }
    simplecircle(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double setRadius(double newRadius){
        radius = newRadius;
        return radius;
    }
}