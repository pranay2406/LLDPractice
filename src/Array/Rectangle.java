package Array;

public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;

    int getArea()
    {
        return this.height * this.width;
    }

    int getPerimeter()
    {
        return 2*(this.height+this.width);
    }

    Point getBottomRight()
    {
        Point bottomRight = new Point(topLeft.x + height,topLeft.y-height);

        return bottomRight;
    }
     public static void xyx()
     {
         System.out.println("xyx without para 1");
     }
     public static void xyx(int a)
     {
         System.out.println("xyx with para 2");
     }
}

