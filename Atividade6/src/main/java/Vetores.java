
import java.util.Arrays;


/**
 *
 * @author gabriel de carli
 */
class Vetores {

    public double[] maiorvetor(double[] vet, int n) {
        double maior[] = new double[n];

       
        Arrays.sort(vet); 
        int j = 0;
        for (int i = (vet.length -1 ) ; n > 0; n--) {
            
            maior[j] = vet[i];
            i--;
            j++;
        }
       
        return maior;
    }
    
   public double[] menorvetor(double[] vet, int n) {
        double[] menor = new double[n];

        for (int i = 0; n > 0; n--) {
            menor[i] = vet[i];
            i++;
        }
        Arrays.sort(menor);
        return menor;
    }
}
    

