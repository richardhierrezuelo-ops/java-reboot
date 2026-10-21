public class PersonDemo {

    public static void main(String[] args) {
       try {
           Person p = new Person("Rick", 35);
           System.out.println(p);

           Person P2 = new Person("Portia", 151);
           System.out.println(P2);
       } catch  (InvalidAgeException e){
           System.out.println(e.getMessage());
       }
    }
}
