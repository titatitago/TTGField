package titatitago.fields;

import titatitago.ITTGField;
import titatitago.TTGFieldDataType;

public class TTGStringField extends TTGAbstractField<String> {

    private int maxLen = 0;
    private int minLen = 0;

    public TTGStringField(String name) {
        super(name);
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        if (maxLen < 0) {
            maxLen = 0;
        }
        this.maxLen = maxLen;
    }

    public int getMinLen() {
        return minLen;
    }

    public void setMinLen(int minLen) {
        if (minLen < 0) {
            minLen = 0;
        }
        this.minLen = minLen;
    }

    public TTGFieldDataType getDataType() {
        return TTGFieldDataType.STRING;
    }

    public Class<String> getFieldValueClass() {
        return String.class;
    }

    public boolean validateFieldValue(String v) {
        return false;
    }
}
