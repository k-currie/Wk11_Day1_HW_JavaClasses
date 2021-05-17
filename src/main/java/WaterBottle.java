public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public boolean takeDrink(){
        if(this.volume>=10){
            this.volume = this.volume-10;
            return true;
        }
        return false;
    }

    public int takeDrinkV2(){
        if(this.volume>=10){
            this.volume = this.volume-10;
            return this.volume;
        }
        return 0;
    }

    public int emptyBottle() {
        this.volume = 0;
        return this.volume;
    }

    public int makeBottleFull() {
        this.volume = 100;
        return this.volume;
    }
}
