package JavaForPractice;

public abstract class Practice01Abstract {
    abstract void sound();

    public static void main(String[] args) {
        abc p = new abc();
        p.sound();
    }
}

class xyz extends Practice01Abstract {
    @Override
    void sound() {
        System.out.println("hello");
    }
}

 class abc extends xyz {} 
