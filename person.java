class person {
  public void info() {
    System.out.println("User Info");
  }
}

class homecontact extends person {
  public void info() {
    System.out.println("Home");
  }
}

class department extends person {
  public void info() {
    System.out.println("IT");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    person info = new person();  // Create a Animal object
    person homecontact = new Pig();  // Create a Pig object
    person department = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}