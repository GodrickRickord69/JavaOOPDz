//package task1.Serializable;
//
//import java.io.*;
//
//public class FileHandler {
//    public boolean save(Serializable serializable, String file){
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
//            objectOutputStream.writeObject(serializable);
//            return true;
//        }catch (IOException e){
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public Object read(String file) {
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
//            return objectInputStream.readObject();
//        }catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
