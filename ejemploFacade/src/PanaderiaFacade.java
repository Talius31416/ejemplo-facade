public class PanaderiaFacade {
    private Panaderia panaderia;
    public PanaderiaFacade(Panaderia pn){
        panaderia = pn;
    }
    /*Se implementan los metodos para abrir la panaderia
    * concentrandolos todos en un solo metodo para ahorrar lineas de codigo y se mas efectivo*/
    public void openPanaderia(){
        panaderia.openDoors();
        panaderia.washDishes();
        panaderia.cleanTables();
        panaderia.makeBread();
    }
    /* Se implementan los metodos para cerrar la panaderia
     * concentrandolos todos en un solo metodo para ahorrar lineas de codigo y se mas efectivo*/
    public void closePanaderia(){
        panaderia.closeDoors();
        panaderia.washDishes();
        panaderia.storeDishes();
        panaderia.cleanTables();
        panaderia.storeBread();
    }
}
