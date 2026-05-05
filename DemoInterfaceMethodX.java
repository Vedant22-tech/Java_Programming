interface Circle
{
    // Characteristics
    float PI = 3.14f;     // public static final (by-Default)

    // Behaviors      public abstract (By-default)
    float Area(float Radius);
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return Circle.PI * Radius * Radius;
    }

    public float Circumference(float Radius)   
    {
        return 2 * Circle.PI * Radius;
    }

}

class DemoInterfaceMethodX
{
    public static void main(String A[])
    {
        // Circle cobj = new Circle();  - Note Allowed

        Marvellous mobj = new Marvellous();

        float Ret = 0.0f;
        Ret = mobj.Area(10.5f);
        System.out.println("Area is :"+Ret);

        Ret = mobj.Circumference(10.5f);
        System.out.println("Circumference is :"+Ret);

    }
}
