public class Panaderia {
    private String id;
    public Panaderia(String id) {
        this.id = id;
    }
    //acciones que se hacen para poder abrir una panaderia y cerraralas
    public void openDoors(){
        print("Puertas abiertas");
    }
    public void closeDoors(){
        print("Puertas cerradas");
    }
    public void makeBread(){
        print("se hizo el bread");
    }
    public void washDishes(){
        print("Se lavaron los platos");
    }
    public void cleanTables(){
        print("Se limpiaron las mesas");
    }
    public void storeBread(){
        print("Se guardo el pan");
    }
    public void storeDishes(){
        print("se guardaron los platos");
    }
    private void  print(String s){
        System.out.println(s);
    }
}
