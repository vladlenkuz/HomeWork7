package HomeWork7;

public class Plate {
    private int food;
    public boolean ate_Satiety;

    public Plate(int food) {
        this.food = food;
    }
    public void differentFood(int n){
        if (food < n ){
            ate_Satiety = false;
            System.out.println("На тарелке мало еды!!!");

    } else {
            ate_Satiety = true;
            food -= n;
            }
}
    public void info(){
        System.out.println("На тарелке кусочков мяса : " + food);
    }

    public void addPlateFood(int food_plus){
            food += food_plus;
    }

    public int getFood() {
        return food;
    }
}
