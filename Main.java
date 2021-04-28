package HomeWork7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Нужно накормить 5 котов!!!");
        Plate plate1 = new Plate(80);
        plate1.info();
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 14, false);
        cats[1] = new Cat("Тишка", 10, false);
        cats[2] = new Cat("Маруся", 19, false);
        cats[3] = new Cat("Рыжик", 40, false);
        cats[4] = new Cat("Матильда", 17, false);

        for (int i = 0; i< cats.length; i++){
            if (plate1.getFood() < cats[i].getAppetite()){
                plate1.addPlateFood(50);
                System.out.println("Добавили 50 кусочков мяса");
            }
            cats[i].eat(plate1);
            cats[i].infoCat();
            plate1.info();

        }
//        Cat cat = new Cat("Barsic", 15, false);

//        plate1.info();
//        cat.eat(plate1);
//        plate1.info();
//        cat.infoCat();
    }
}
