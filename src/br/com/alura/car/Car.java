package br.com.alura.car;

public class Car {
    private String modelName;
    private double priceYear01;
    private double priceYear02;
    private double priceYear03;

//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    public void setPricesYear(double priceYear01, double priceYear02, double priceYear03) {
//        this.priceYear01 = priceYear01;
//        this.priceYear02 = priceYear02;
//        this.priceYear03 = priceYear03;
//    }

    public Car(String modelName, double priceYear01, double priceYear02, double priceYear03) {
        this.modelName = modelName;
        this.priceYear01 = priceYear01;
        this.priceYear02 = priceYear02;
        this.priceYear03 = priceYear03;
    }

    public void displaysInfo() {
        System.out.printf("""
                ************************************
                Modelo: %s
                Preço ano 01 R$%.2f
                Preço ano 02 R$%.2f
                Preço ano 03 R$%.2f
                Maior preço: R$%.2f
                Menor preço: R$%.2f
                ************************************
                """, modelName, priceYear01, priceYear02, priceYear03, calculateHighestPrice(), calculateLowestPrice());
    }

    private double calculateHighestPrice(){
        double highestPrice = priceYear01;

        if  (priceYear02 > highestPrice) highestPrice = priceYear02;
        if (priceYear03 > highestPrice) highestPrice = priceYear03;

        return highestPrice;
    }

    private double calculateLowestPrice(){
        double lowestPrice = priceYear01;

        if (priceYear02 < lowestPrice) lowestPrice = priceYear02;
        if (priceYear03 < lowestPrice) lowestPrice = priceYear03;

        return lowestPrice;
    }
}
