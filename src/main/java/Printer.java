public class Printer {

    private int sheetsLeft;


    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
    }

    public int print(int pages, int copies){
        if(pages*copies <= this.sheetsLeft){
            return this.sheetsLeft = this.sheetsLeft-(pages*copies);
        }
            return 0;
    }

}
