class animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    public static void main(String []args){
        Dog d=new Dog();
        d.eat();
        d.bark();

    }
}
output
  Animal is eating
  dog is barking
