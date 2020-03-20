package zad2PO;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class zad2PO{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("dane.txt");
        Scanner in = new Scanner(file);
        ArrayList<Person> personList = new ArrayList<Person>();

        while(in.hasNext()){
            String line = in.nextLine();
            String[] splited = line.split("\\s+");
            String lastName = splited[1];
            int lastNameLenght = lastName.length();
            if(splited[0].length()>3 && lastName.substring(lastNameLenght-3, lastNameLenght).contains("ski")){
                Person person = new Person(splited[0], splited[1], Integer.parseInt(splited[2]), Float.parseFloat(splited[3]));
                personList.add(person);
            }
        }

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Float.compare(p1.getEffectiveness(), p2.getEffectiveness());
            }
        });

        PrintWriter zapis = new PrintWriter("dane.max.txt");

        try {
            float max = personList.get(personList.size() - 1).effectiveness;
            List<Person> resultList = new ArrayList<Person>();
            for (Person person : personList) {
                if (person.getEffectiveness() == max) {
                    String tempLastName = person.getLastName();
                    String substringBetweenFirstCharAndSKI = "", tempChar = "";
                    for (int i = 1; i < person.getLastName().length() - 3; i++) {
                        substringBetweenFirstCharAndSKI = substringBetweenFirstCharAndSKI + tempLastName.charAt(i);
                        tempChar = tempChar + '*';
                    }
                    tempLastName = tempLastName.replace(substringBetweenFirstCharAndSKI, tempChar);

                    person.setLastName(tempLastName);
                    resultList.add(person);
                }
            }
            for(Person person : resultList){
                zapis.println(person.getName() + " " + person.getLastName() + " " + person.getAge());
            }
            zapis.close();
        }
        catch (IndexOutOfBoundsException i){
            zapis.println("");
            zapis.close();
        }
    }
}