import java.util.*;
import java.io.*;
import java.net.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String y = inp.nextLine();
        System.out.print("Enter the gender: ");
        String g = inp.nextLine();
        System.out.print("Enter the name: ");
        String n = inp.nextLine();
        int gender = getGender(g);
        try {
            URL link = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + y + ".txt");
            //BufferReader is used to read the data fast
            BufferedReader read = new BufferedReader(new InputStreamReader(link.openStream()));
            String data;
            while ((data = read.readLine()) != null) {
                String[] parts = data.split("\\s+");
                if (parts[gender].equals(n)) {
                    System.out.println(n + " is ranked #" + parts[0] + " in year " + y);
                    return;
                }
            }
            //IOException is used for catching the errors in writing the name of file
        } catch (IOException ex) {
            System.out.println("No such a file");
        }

        System.out.println("The name " + n + " is not ranked in year " + y);
    }
    public static int getGender(String g) {
        if (g.equalsIgnoreCase("M")) {
            return 1;
        } else {
            return 3;
        }
    }
}