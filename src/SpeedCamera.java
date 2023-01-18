public class SpeedCamera {
    private String code;
    private int roadNumber;
    private int maxSpeed;
    private String[] overSpeedCars;

    public SpeedCamera(String code, int roadNumber, int maxSpeed, String[] overSpeedCars) {
        this.code = code;
        this.roadNumber = roadNumber;
        this.maxSpeed = maxSpeed;
        this.overSpeedCars = overSpeedCars;
    }

    private boolean addCar(String carNumber,int speed){
        boolean isAddCar = false;
      if (speed>this.maxSpeed){
          String[] overSpeedCars2 = new String[this.overSpeedCars.length+1];
          for (int i=0;i<this.overSpeedCars.length;i++){
              overSpeedCars2[i]=this.overSpeedCars[i];
                  isAddCar = true;
              }
          overSpeedCars2[overSpeedCars2.length-1]=carNumber;
          this.overSpeedCars = overSpeedCars2;
          }
      return isAddCar;
    }

    public String getCode() {
        return code;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String[] getOverSpeedCars() {
        return overSpeedCars;
    }
}
