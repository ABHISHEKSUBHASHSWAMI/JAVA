//program to implement single inheritence

class Shape{
    void shape(){
        System.out.println("This is a triangle");
    }
}

class Triangle extends Shape{
    void dimension(){
        System.out.println("3 sides");
    }
}

class SingleInheritence{
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.shape();
        t.dimension();
    }
}