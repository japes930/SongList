import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        int n = 1;
        for (int i = 0; i< 10;i++){
            System.out.println("What is the name of the song?");
            String title = keyboard.nextLine();
            System.out.println("Who is the artist?");
            String artist = keyboard.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
            System.out.printf("Added song #%d to library.\n", n);
            System.out.println("...");
            n++;
        }

        //print all the songs in the array list
        for(Song item: songs){
            System.out.println(item.display());
        }

        //look for blue and print if found
        String titleToFind = "Emma";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}
//'Saturday Nights' - Khalid
//        'I Feel Home' - O.A.R.
//        'Violence' - Blink 182
//        'Suncity' - Khalid
//        'Amber' - 311
//        'Pork and Beans' - Weezer
//        'Get it Faster' - Jimmy Eat World
//        'Promise' - Eve 6
//        'Jenny' - Walk The Moon
//        'Emma' - Imagine Dragons