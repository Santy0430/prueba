public class TurnoVirtual {
    //ESTA CLASE NO TIENE MAIN
    
    //INSERTE LOS ATRIBUTOS
    private string [] turnos;
    private string[] turnosPerdidos;
    private boolean estadoTurnoVirtual = true;
    private int turnosEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;
    
    //INSERTE EL MÉTODO CONSTRUCTOR
    public void atenderProximoTurno(){}
    public void agregarTurnoPerdido(){}
    public void cambiarEstadoTurno(){}
    
    public TurnoVirtual(String[] turnos, String[] turnosPerdidos){
        this.turnos = turnos;
        this.turnosPerdidos =turnosPerdidos;
    }
    //INSERTE LOS GETTERS Y SETTERS
    public String[] getTurnos(){
        return turnos;
    }
    public void setTurnos(String[] turnos){
        this.turnos = turnos;
        
    }
    //INSERTE LOS DEMÁS MÉTODOS

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }  
}