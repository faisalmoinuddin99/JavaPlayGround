class Base {
    int x ;
    static String collegeName = "IIT Mumbai";
    public Base(){

    }
        public Base(int _x){
            x = _x;
        }

        public void displayBase(){
            System.out.println("Base Class X: " + x);
        }
}

class Derived extends Base {
    public Derived(){
        super(30);  // 3. super() can be used to invoke immediate parent class constructor.

        super.displayBase(); // 2. super can be used to invoke immediate parent class method.

    }
    public void display(){
        System.out.println("X: " + x);
        System.out.println(super.collegeName); // 1. super can be used to refer immediate parent class instance variable.

    }
}

class Main {
    public static void main(String[] args) {

        Derived d = new Derived();
        d.display();
    }
}