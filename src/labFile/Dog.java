package labFile;


//Derived class
//Exp-4
public class Dog extends Animal {
 
 // Overriding method (Runtime Polymorphism)
 @Override
 void sound() {
     System.out.println("Dog barks");
 }

 // Overloaded methods (Compile-time Polymorphism)
 void bark() {
     System.out.println("Dog is barking");
 }

 void bark(String soundType) {
     System.out.println("Dog is barking: " + soundType);
 }

 void bark(int times) {
     System.out.println("Dog barked " + times + " times");
 }
}
