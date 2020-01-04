package LocalLearn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Amiedon
 * @Date: 2019/12/30 14:02
 */
public class MapSql {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("SerialNo", "123");
        map.put("RelativeNo", "000");
        map.put("ProductId", "amiedon");
        map.put("Publisher", "invictus");
        StringBuilder sSqlInit = new StringBuilder("insert into ABS_APPLY_RECORD(");
        StringBuilder sSqlValue = new StringBuilder(") values (");
        StringBuilder valueTemp = new StringBuilder();
        for (String key : map.keySet()){
            valueTemp = new StringBuilder();
            sSqlInit.append(key).append(",");
            valueTemp.append("'").append(map.get(key)).append("',");
            sSqlValue.append(valueTemp);
        }
        sSqlInit.deleteCharAt(sSqlInit.length()-1);
        sSqlValue.deleteCharAt(sSqlValue.length()-1);
        sSqlValue.append(")");
        String sSql = sSqlInit.append(sSqlValue).toString();
        //System.out.println(sSqlInit.append(sSqlValue));
        System.out.println(sSql);
    }
}
