public class Stringop {
 public static void main(String[] args) {
    
    // string is not a primitive datatype it is actually a class


    String name="sakshi";//string literals and stored in string literal pool



    System.out.println(name.charAt(2));

    // new String()->creates a new object in heap memory //heap memory-> has not fixed size 
    //String name==name is the reference variable it is stored stacked memory and also the memory addres of obj is stored in stack memory like name|105

    String userName=new String("Sakshi20");

    System.out.println(userName);
System.out.println(userName.charAt(2));
System.out.println(userName.compareTo(name));
System.out.println(userName.concat("apankar"));
System.out.println(userName);
System.out.println(userName.isEmpty());

// == ->checks memory address
// equals() -> checks actual content




 }
    
}