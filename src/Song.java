public class Song {
    private String artist, title;


    public Song(){

    }

    public String display(){
        return "'" + this.title + "'"+ " - " + this.artist;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

