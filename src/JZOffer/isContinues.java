package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class isContinues {
    public boolean isContinue(int[] numbers){
        if (numbers.length<5)
            return false;
        int min = 14;
        int max = 0;
        int[] d = new int[14];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == 0)
                continue;
            d[numbers[i]]++;
            if (d[numbers[i]]>1)
                return false;
            if (d[numbers[i]]>max)
                max = d[numbers[i]];
            if (d[numbers[i]]<min)
                min = d[numbers[i]];
        }
        if (max - min < 5)
            return true;
        return false;
    }
}
