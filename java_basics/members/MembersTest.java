class MembersTest {
    public static void main(String[] args){

        Members bike = new Members();
        bike.setNumberOfWheels(2);
        bike.setColor("Green");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        System.out.println(String.format("Bike: %s wheels; Color: %s", bikeWheels, bikeColor));

        Members car = new Members();
        car.setNumberOfWheels(4);
        car.setColor("Red");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        System.out.println(String.format("Car: %s wheels; Color: %s", carWheels, carColor));
    }
}