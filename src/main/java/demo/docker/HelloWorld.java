package demo.docker;

public class HelloWorld {

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    System.out.println(helloWorld.sayHello());
  }

  public String sayHello() {
    return "Hello, World";
  }
}
