public class ComparaMetodos {

    static int[] sizes = {1000,2000,4000,8000,16000,32000};
    public static void main(String[] args) {
        table(new Ordenar1Vector());
        System.out.println("--------------------------------");
        table(new Ordenar2Vector());
    }
    
    private static void table(OrdenarVector ov){
        System.out.println(ov.nombreMetodo());
        DatosEstadisticos[] deVecInverso = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(ov, sizes);
        MediaDatosEstadisticos[] mediaDeVecRnd = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(ov, sizes);
        
        System.out.println("\nVector inversamente ordenado\n");
        System.out.printf("\t\t%-10s\t %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        
        for(int i = 0; i<sizes.length; i++){
            System.out.printf("%8d  %12f\t   \t%12d\t %10d\n",
                sizes[i],
                deVecInverso[i].dameTiempo()/1000.,
                deVecInverso[i].dameComparaciones(),
                deVecInverso[i].dameMovimientos());
        }
        
        System.out.println("\nVector aleatorio\n");
         System.out.printf("\t\t%-10s\t %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        
        for(int i = 0; i<sizes.length; i++){
            System.out.printf("%8d  %12f\t   \t%12d\t %10d\n",
                sizes[i],
                mediaDeVecRnd[i].dameMediaTiempos()/1000.,
                mediaDeVecRnd[i].dameMediaComparaciones(),
                mediaDeVecRnd[i].dameMediaMovimientos());
        }
        
    }
    
}