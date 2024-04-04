import java.util.Scanner;
public class TextProcessingApplication {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text");
        while(true){
        String str = sc.nextLine();
        System.out.println("1. Word Count");
        System.out.println("2. Character Count");
        System.out.println("3. Reverse Text");
        System.out.println("4. Remove Duplicates");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice:");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1 : int count = str.split("\\s+").length; // when we do split in js when we give little space it understnd words in a string similarly in java we have one , double  space and tab space get converted into array element regx by writing \\s+
            // remove all spaces and give all the words in a array
            System.out.println("Number of words:" + count);
                break;
            case 2 : int characters = str.replaceAll("\\s", "").split("").length;
                System.out.println("Character Count" + characters);
                break;
            case 3 : StringBuilder stra = new StringBuilder(str);
                System.out.println(stra.reverse());
                break;
            case 4 : HashSet<String> res = new HashSet<String>(Arrays.asList(str));
                System.out.println(res.toString());
                break;
            case 5 :System.exit(0);
                break;
            default : System.out.println("Invalid Choice");


        }
        sc.close();
    }


    }
    
}
