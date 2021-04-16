import java.util.Scanner;
public class Kennel
{
  public static void main(String[] args)
  {
    class Dog
    {
    double age = 1;
    String name = "i";
    String description = "i";
      public Dog()
      {
        age = 1;
      }
      public double getHumanAge()
      {
        return (7*age);
      }
      public void newAge(double age)
      {
        age = age;
      }
      public double getDogAge()
      {
        return (age/7);
      }
      public void newName(String name)
      {
        name = name;
      }
      public void newDescription(String description)
      {
        description = description;
      }
      public String getDescription()
      {
        return description;
      }
      public String getName()
      {
        return name;
      }
    }
    
    Scanner scan = new Scanner(System.in);
    
    Dog dog1, dog2, dog3;
    
    dog1 = new Dog();
    dog2 = new Dog();
    dog3 = new Dog();
    
    System.out.println("Current Dog Names: dog1, dog2, dog3");
    System.out.println("Input new names now (in order). Else, type in the above");
    
    dog1.name = scan.next();
    dog2.name = scan.next();
    dog3.name = scan.next();
    
    System.out.println("Current Dog Ages (in dog years): 1, 1, 1");
    System.out.println("Input new ages now (in order). Else, type in the above");
    
    dog1.age = scan.nextDouble();
    dog2.age = scan.nextDouble();
    dog3.age = scan.nextDouble();
    
    System.out.println("Current Dog Descriptions: pretty little puppy, middle-aged dog, retired dog");
    System.out.println("Input new descriptions now (in order). Else, type in the above");
    
    dog1.description = scan.next();
    dog2.description = scan.next();
    dog3.description = scan.next();
   
    System.out.println("Dog #1 is " + dog1.getName() + ", a " + dog1.getDescription() + " that is " + dog1.getHumanAge() + " human years old.");
    System.out.println("Dog #2 is " + dog2.getName() + ", a " + dog2.getDescription() + " that is " + dog2.getHumanAge() + " human years old.");
    System.out.println("Dog #3 is " + dog3.getName() + ", a " + dog3.getDescription() + " that is " + dog3.getHumanAge() + " human years old.");
   }
  }  