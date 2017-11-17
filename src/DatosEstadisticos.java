public class DatosEstadisticos{

    private double time;
    private int cmp;
    private int mov;
    
    public DatosEstadisticos() {
        this.time = 0;
    }
    
    public void añadeTiempo(double time){
        this.time += time;
    }
    
    public void estableceTiempo(double time){
        this.time = time;
    }
    
    public double dameTiempo(){
        return time;
    }
    
    public void añadeComparacion(){
        cmp++;
    }
    
    public void añadeMovimiento(){
        mov++;
    }
    
    public void estableceComparaciones(int cmp){
        this.cmp = cmp;
    }
    
    public void estableceMovimientos(int mov){
        this.mov = mov;
    }
    
    public int dameComparaciones(){
        return cmp;
    }
    
    public int dameMovimientos(){
        return mov;
    }
}