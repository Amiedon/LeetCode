package LeetCode;

import java.util.Stack;

/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。

 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

 示例:

 s = "3[a]2[bc]", 返回 "aaabcbc".
 s = "3[a2[c]]", 返回 "accaccacc".
 s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/decode-string
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/9/29.
 */
public class DecodeString {
    class Decode{
        int count;
        String str;

        public Decode(int count, String str) {
            this.count = count;
            this.str = str;
        }
    }

    public String decodeString(String s) {
        Stack<Decode> stack = new Stack<>();
        String res = "";
        int count = 0;
        for (int i=0;i<s.length();i++){
            if ('0'<= s.charAt(i)  && s.charAt(i) <= '9'){
                count = 10 * count + (s.charAt(i) - '0');
            }else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                res += s.charAt(i);
            }else if (s.charAt(i) == '['){//入栈
                Decode decode = new Decode(count, res);
                stack.add(decode);
                count = 0;
                res = "";
            }else if (s.charAt(i) == ']'){//出栈
                Decode decode = stack.pop();
                count = decode.count;
                StringBuilder stringBuilder = new StringBuilder(res);
                StringBuilder stringBuilder2 = new StringBuilder(res);
                for (int j=0;j<count-1;j++){
                    stringBuilder.append(stringBuilder2.toString());
                }
                res = stringBuilder.toString();
                res = decode.str + res;
                count = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = new DecodeString().decodeString("3[a]2[b4[F]c]");
        System.out.println(s);
    }
}
