package School2017;

import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

/**
 * Created by Amie on 2018/8/13.
 */
public class SaveEase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] cols = new int[n+1];
        int [] raws = new int[n+1];
        int min = 1000;
        for (int i=1;i<=n;i++){
            cols[i] = scanner.nextInt();
        }
        for (int i=1;i<=n;i++){
            raws[i] = scanner.nextInt();
        }
        for (int i=1;i<=n;i++){
            if (cols[i]+raws[i]-2 < min){
                min = cols[i]+raws[i]-2;
            }
        }
        System.out.println(min);
    }
}
