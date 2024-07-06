interface Drawable{
    void Draw();
}
class Circle implements Drawable{
    public void Draw(){
        System.out.println("The Circle Have Round Shape");
    }
}
class Rectangle implements Drawable{
    public void Draw(){
        System.out.println("The Rectangle Have Square Shape");
    }
}
class Triangle implements Drawable{
    public void Draw(){
        System.out.println("The Triangle Can have Three Side ");
    }
}
public class DrawableInterface {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.Draw();

        Rectangle r1 = new Rectangle();
        r1.Draw();

        Triangle t1 = new Triangle();
        t1.Draw();
        

    }

    
}
