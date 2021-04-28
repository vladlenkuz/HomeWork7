ackage HomeWork7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;
    public boolean tRue = true;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p){
        p.differentFood(appetite);
        if(p.ate_Satiety)
        setSatiety(tRue);
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void infoCat(){
        System.out.println("Кошка: " + getName() + ". Степень сытости: " + isSatiety());
    }

    public int getAppetite() {
        return appetite;
    }
}
