public class SpeedCameraNetwork {

   private SpeedCamera [] speedCameras;

    private void addSpeedCamera(SpeedCamera speedCamera){
       if (speedCamera.getOverSpeedCars().length>200){
           SpeedCamera [] speedCameras2 = new SpeedCamera[this.speedCameras.length+1];
           for (int i=0;i<this.speedCameras.length;i++){
               speedCameras2[i]=this.speedCameras[i];
           }
           speedCameras2[speedCameras2.length-1]=speedCamera;
        }
    }
    private void getIncreasedEnforcementRoads(){
       for (int i=0;i<this.speedCameras.length;i++){
          if (this.speedCameras[i].getOverSpeedCars().length>200){
              System.out.println(this.speedCameras[i].getRoadNumber());
          }
       }
    }
    private boolean isCarOverspeeded(String carNumber){
        boolean isCarOverspeeded = false;
        for (int i=0;i<this.speedCameras.length;i++){
            for (int j=0;j<this.speedCameras[i].getOverSpeedCars().length;j++){
                if (carNumber.equals(this.speedCameras[i].getOverSpeedCars()[j])){
                    System.out.println(this.speedCameras[i].getCode());
                    isCarOverspeeded =true;
                }
            }
        }
        return isCarOverspeeded;
    }
}
