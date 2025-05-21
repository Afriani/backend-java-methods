public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.

        System.out.println("Hey"); //Bert
        System.out.println("Hey"); //Ernie
        System.out.println("Welcome to this wonderful conversation");
        System.out.println("Thnx, I'm looking forward to it");
        System.out.println("How about this weather?");
        System.out.println("I really don't mind the cold....");
        System.out.println("And did you see that random program on that random channel?");
        System.out.println("Well... I did watch a random program on a random channel...");
        System.out.println("Thank you for a wonderful conversation!");
        System.out.println("Cya");

        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.
        bertSays("Hey"); //Bert
        ernieSays("Hey"); //Ernie
        bertSays("Welcome to this wonderful conversation");
        ernieSays("Thnx, I'm looking forward to it");
        bertSays("How about this weather?");
        ernieSays("I really don't mind the cold....");
        bertSays("And did you see that random program on that random channel?");
        ernieSays("Well... I did watch a random program on a random channel...");
        bertSays("Thank you for a wonderful conversation!");
        ernieSays("Cya");
    }

    // nieuwe methods komen hier
    public static void bertSays(String tekst) {
        System.out.println("Bert says: " + tekst);
    }

    public static void ernieSays(String tekst) {
        System.out.println(tekst + " says Ernie");
    }
}