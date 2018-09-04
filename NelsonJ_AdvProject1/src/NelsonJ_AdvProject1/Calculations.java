package NelsonJ_AdvProject1;

public class Calculations 
{
    private final int SIZE = 10;
    private double dblTotalMean,
                dblMean,
                dblTotalStDev,
                dblMeanStDev,
                dblStDev;
    private double[] arrStDev = new double[SIZE];
    
    public double Mean(double[] array)
    {
        for(int i = 0; i < SIZE; i++)
        {
            dblTotalMean += array[i];
        }
        
        return dblMean = dblTotalMean / SIZE;      
        
    }
    
    public void StanDev(double[] array)
    {
        for(int i =0; i < SIZE; i++)
        {
            arrStDev[i] = Math.pow((array[i] - dblMean), 2);
        }
        
        for(int i = 0; i < SIZE; i++)
        {
            dblTotalStDev += arrStDev[i];
        }
        
        dblMeanStDev = dblTotalStDev / SIZE;
        dblStDev = Math.sqrt(dblMeanStDev);
        
        MainGUI.lblStanDev.setText("" + dblStDev);
    }         
}
