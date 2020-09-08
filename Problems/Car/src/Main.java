class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate(){
        speed += 5;
    }

    public void brake(){
        while (speed != 0){
            speed -= 5;
        }
    }
}