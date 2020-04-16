package titatitago;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface ITTGField<T> {

    String getName();

    String getLabel();

    /**
     * get field basic data type
     * @return
     */
    TTGFieldDataType getDataType();

    /**
     * field type
     * @return
     */
    String getType();

    boolean isDataTypeOf(ITTGField f);

    boolean isTypeOf(ITTGField f);

    Class<T> getFieldValueClass();

    /**
     * 验证数据是否符合字段要求
     *
     * @param v
     * @return
     */
    boolean validateFieldValue(T v);
}
