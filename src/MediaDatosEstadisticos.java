public class MediaDatosEstadisticos{
    
    private long nDatosEstadisticos,nComparaciones, nMovimientos;;
    private double tiempoTotal;
      
    
    public MediaDatosEstadisticos(){
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        tiempoTotal += de.dameTiempo();
        nComparaciones += de.dameComparaciones();
        nMovimientos += de.dameMovimientos();
        nDatosEstadisticos++;
    }
    
    public double dameMediaTiempos(){
        return tiempoTotal/(double)nDatosEstadisticos;
    }
    
    
    public int dameMediaComparaciones(){
        return (int)(nComparaciones/nDatosEstadisticos);
    }
    
    public int dameMediaMovimientos(){
        return (int) (nMovimientos/nDatosEstadisticos);
    } 
}