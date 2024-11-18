public class Car {
    private String name, model;
    private double price;

    public PrivateVariables(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;    
    }

    public  void displayDetails(){
        String nameShow = "Name ";
        String modelShow = "Model ";

        System.out.println(nameShow + name)
        System.out.println(modelShow + model)
        System.out.println("Price " + price)


    }

}
