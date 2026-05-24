package question_04;

public class Main {
    public static void main(String[] args) {

        Owner owner1 =
                new Owner("Kavindu", "0712345678");

        Bicycle bicycle1 =
                new Bicycle(owner1);

        System.out.println("Owner Name: "
                + bicycle1.getOwner().getOwnerName());

        System.out.println("Phone Number: "
                + bicycle1.getOwner().getPhoneNo());
    }
}
