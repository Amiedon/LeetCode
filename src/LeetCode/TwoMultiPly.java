package LeetCode;

import java.util.Arrays;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

 示例 1:

 输入: num1 = "2", num2 = "3"
 输出: "6"
 示例 2:

 输入: num1 = "123", num2 = "456"
 输出: "56088"
 * Created by Amie on 2019/9/5.
 */
public class TwoMultiPly {
    public String multiply(String num1, String num2){
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int temp = 1;
        int length1 = num1.length();
        int length2 = num2.length();
        int [] result = new int[length1 + length2];
        int index = 0;
        for (int j=0;j<length2;j++) {
            for (int i = 0; i < length1; i++) {
                temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[i+j] += temp / 10;
                index = i+j;
                for (int k=index;k>0;k--){
                    if (result[k] <10)
                        break;
                    result[k-1]+=result[k]/10;
                    result[k] = result[k]%10;
                }
                result[i+j+1] += temp % 10;
                for (int k=i+j+1;k>=0;k--){
                    if (result[k] <10)
                        break;
                    result[k-1]+=result[k]/10;
                    result[k] = result[k]%10;

                }
            }
        }
        StringBuilder stringBuffer = new StringBuilder();
        for (int i=0;i<result.length;i++){
                stringBuffer.append(result[i]);
        }
        int index2 = 0;
        while (index2<stringBuffer.length()&&stringBuffer.charAt(index2) == '0'){
            index2 ++;
        }
        return stringBuffer.toString().substring(index2);
    }

    public static void main(String[] args) {
        String result = new TwoMultiPly().multiply("0", "0");
        System.out.println(result);
    }
}
