import java.util.ArrayList;

public class List {
      public static void main(String args[]){
           operasi motor = new operasi();
           System.out.println(motor.sisaMotor());

           motor.tambahMotor("Mio");
           motor.tambahMotor("Beat");
           motor.tambahMotor("Vario");
           System.out.println(motor.sisaMotor());
           motor.gantiMotor(1,"BlackBerry");
           System.out.println(motor.sisaMotor());
           motor.motorRusak(0);
           System.out.println(motor.sisaMotor());
      }
}

class Motor {
      ArrayList<String> motorcycle = new ArrayList<>();

      public Motor(){}
      public void setMotor(ArrayList<String> motorcycle) {
            this.motorcycle = motorcycle;
      }
      public ArrayList<String> getMotor(){
            return this.motorcycle;
      }
} 

class operasi extends Motor {
      public void tambahMotor(String motorcycle){
            super.getMotor().add(motorcycle);
      }
      public String motorRusak (int index){
            return super.getMotor().remove(index);
      }

      public void gantiMotor(int index, String motorcycle){
            super.getMotor().set(index, motorcycle);
      }

      public ArrayList<String> sisaMotor(){
            return super.getMotor();
      }
}