package Day1;

public class solution {
  public static void main(String[] args) {
    String[] names = {"Tareq", "Afsana", "Imtiaz", "Pulok", "Robin", "Samia", "Rupok"};
    String input = "pulok";
    
    for (String name : names) {
      if (name.toLowerCase().contains(input.toLowerCase())) {
        System.out.println(name);
      }
    }
  } 
}
