class A {
    int x = 10;
}

class B extends A {
    void display() {
        System.out.println(x);
    }

    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}
