import java.util.*;

public class Main {
   public static void main(String args[]) {

    //ArrayList forEach Exercises
       ArrayList<String> animals = new ArrayList<String>();
       animals.add("bear");
       animals.add("turtle");
       animals.add("fish");
       animals.add("raven");
       animals.add("wolf");
       animals.add("deer");
       
       for(String animal: animals) {
           System.out.print(animal +", ");
       }

       Scanner scanner = new Scanner(System.in);

       System.out.println("\nWhat is your favorite animal?\n");
       String favAnimal = scanner.nextLine();

       if(animals.contains(favAnimal.toLowerCase())) {
           System.out.printf("I love %ss!", favAnimal);
       } else {
           System.out.println("\nNo, I don't care for those.");
       }

       //Question: What would be a way of doing this without the for each iterator?
       //Answer: I could use the standard For Loop to do the same thing to print out the animals.
       

       //Hash.each Exercise
       HashMap<String, String> person = new HashMap<String, String>();
       System.out.println("\nWhat is your name?");
       String nameEntry = scanner.nextLine();
       person.put("name", nameEntry);

       System.out.println("How old are you?");
       String ageEntry = scanner.nextLine();
       person.put("age", ageEntry);

       System.out.println("what is your home town/city?");
       String homeEntry = scanner.nextLine();
       person.put("hometown", homeEntry);

       System.out.println("What is you favorite food?");
       String foodEntry = scanner.nextLine();
       person.put("favorite food", foodEntry);

       for(Map.Entry<String, String> info : person.entrySet()) {
           String key = info.getKey();
           String value = info.getValue();
           System.out.printf("\nYou %s is %s.", key, value);
       }




       

       

       scanner.close();

   } 
}