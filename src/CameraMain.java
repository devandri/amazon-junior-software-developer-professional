public class CameraMain {
   public static void main(String[] args) {

      // Camera reference referring to SmartCamera object
       Camera newCamera = new SmartCamera();
       newCamera.takePicture();    // calls the takePicture() method of SmartCamera
       newCamera.takePicture(12);
       newCamera.takePicture("focus");
       newCamera.takePicture("focus", 12);
   }
}