package titatitago.fields;

import com.alibaba.fastjson.JSONObject;
import titatitago.TTGFieldDataType;

public class TTGObjectField extends TTGAbstractField<JSONObject> {
    public TTGObjectField(String name) {
        super(name);
    }

    public TTGFieldDataType getDataType() {
        return TTGFieldDataType.OBJECT;
    }

    public Class<JSONObject> getFieldValueClass() {
        return JSONObject.class;
    }

    public boolean validateFieldValue(JSONObject v) {
        return false;
    }
}
