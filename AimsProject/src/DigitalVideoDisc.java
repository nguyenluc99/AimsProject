public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public static void main(String[] args) {

    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc() {
        super();
    }

    public boolean search(String title) {
        String[] strArr = title.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (this.getTitle().toLowerCase().indexOf(strArr[i].toLowerCase()) == -1)
                return false;
        }
        return true;
    }

}