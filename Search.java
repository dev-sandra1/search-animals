import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        //encontar animales, si los encuaqntras muestralos y si no agregalos
        String animals[] = {"dog", "cat", "leon", "tigger", "bird"};

        String animal = "cat";
        boolean exist = false;
        
        for(int i=0; i<animals.length; i++){  
            if(animal.equals(animals[i])){
                System.out.println(animals[i] + " | exist | in the position: " + i);
                exist = true;
                break;
            }
        }

        if(!exist){
           String newAnimals[] = new String[animals.length + 1];
           for(int i=0; i<newAnimals.length - 1; i++){
                newAnimals[i] = animals[i];
           }

           newAnimals[newAnimals.length - 1] = animal;

            for(int i=0; i<newAnimals.length; i++){
               System.out.println( newAnimals[i]);
           }
        }

    }
}