package br.com.alura.car;

public class CarTest {
    public static void main(String[] args) {
        CarModel carModel01 = new CarModel("HB20", 59000, 55000, 53000);
        CarModel carModel02 = new CarModel("Space-Fox", 60000, 55000, 45000);
        CarModel carModel03 = new CarModel("Kicks", 120000, 115000, 105000);

        carModel01.displaysInfo();
        carModel02.displaysInfo();
        carModel03.displaysInfo();
    }
}
