package Day1;

 class SingleInheritance {

    public void display1() {
        System.out.println("Display1");
    }
    
 
    public static void main(String[] args) {
        ChildInheritance childInheritance = new ChildInheritance();
        childInheritance.display1();
        childInheritance.display1();
    }

}

class ChildInheritance extends SingleInheritance {

 
    public void display1() {
        System.out.println("display2");
    }
}
   



