package labFile;

public class InheritancePolymorphismDemo {
	/*Lab Experiment: 4
	Name- Rishi Tiwari
	Roll No- 2301641720090
	*/
    public static void main(String[] args) {
        // Inheritance demonstration
        Dog myDog = new Dog();

        // Method overriding (runtime polymorphism)
        Animal animalRef = new Dog(); // parent reference to child object
        animalRef.sound();  // Calls Dog's sound() due to dynamic dispatch

        // Method overloading (compile-time polymorphism)
        myDog.bark();
        myDog.bark("loudly");
        myDog.bark(3);
    }
}
