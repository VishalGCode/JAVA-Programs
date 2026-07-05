package MetodOverloadingDemo;

public class MOverloading {
	int add(int a, int b) {System.out.println("From Method 1");  return a+b;}
	int add(int a, int b, int c) {System.out.println("From Method 2");  return a+b+c;}
	float add(int c, float d) {System.out.println("From Method 3");  return c+d;}
	long add(int a, long b) {System.out.println("From Method 4");  return a+b;}

}
