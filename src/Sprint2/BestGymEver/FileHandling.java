package Sprint2.BestGymEver;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

    Date date = new Date();

    /**
     * Läser in allt från den upphittade filen.
     * Lägger sedan in all data i en ArrayList med ojektet Person
     * @param person
     */
    public void readFile(ArrayList<Person> person) {

        File file = new File("src/Sprint2/BestGymEver/GymClients.txt");
        try(Scanner sc = new Scanner(file)) {
            String tempName, line1, tempDate;
            String tempNr;
            while(sc.hasNext()){
                line1 = sc.nextLine();
                tempDate = sc.nextLine();

                tempNr = (line1.substring(0, line1.indexOf(',')));
                tempName = line1.substring(line1.indexOf(',')+2);

                // Lägger till alla personer efter jag tagit ut namn, pnr, och reg datum.
                person.add(new Person(tempName, tempNr, tempDate));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Fel, filen hittades inte!");
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Fel");
        }

    }

    /**
     * Tar in person listan och användarens input
     * Kolla om något namn eller personnummer i listan passar med användarens input
     * Om sant så kollar den om användaren är en kund som betala i år eller en återkommande kund.
     * Skickar sedan till skriv metoden.
     * Om falskt retunerar den "Obehörig person"
     * @param person
     * @param input
     * @return
     */
    public String checkFilesForInput(ArrayList<Person> person, String input) {
        boolean found = false;
        for(Person p: person) {
            if(p.getName().equalsIgnoreCase(input) || p.getSocNr().equalsIgnoreCase(input)) {
                if(date.dateCheck(p.getRegDate())) {
                    writeFile(p);
                    return "Välkommen " + p.getName();
                }
                else{
                    writeFile(p);
                    return "Välkommen tillbaka " + p.getName();
                }
            }
        }
        return "Obehörig Person";
    }

    /**
     * Tar in en person, och skriver ut det till en ny fil.
     * @param p
     */
    public void writeFile(Person p) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Sprint2/BestGymEver/GymSessions.txt", true))) {
            writer.write(p.getName() + " personnummer: " + p.getSocNr() + " tränade på datumet: " + date.getCurrentDate() + " klockan: " + date.getCurrentTime() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fel, kunde ej skriva till fil!");
        }
        catch(Exception e) {
            System.out.println("Fel");
        }
    }

}
