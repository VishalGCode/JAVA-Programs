package demoAccessorMutator;

public class AccMutDemo {
	int a;
	int b;
	int sum;
	void add(int a, int b) {
		this.a=a;
		this.b=b;
		sum=this.a+this.b;
	}
}
/* this is used for name ambiguity i.e. more than 1 variable with same and different scope*/
// all get are called as accessor.
// all set are called as mutator.