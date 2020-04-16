package titatitago.fields;

import com.sun.tools.javac.util.StringUtils;
import titatitago.ITTGField;
import titatitago.TTGFieldConst;

public abstract class TTGAbstractField<T> implements ITTGField<T> {
    protected String name;
    protected String label;
    protected String type = TTGFieldConst.DEFAULT_BUSINESS_TYPE;

    protected Class<T> fieldValueClass;

    public TTGAbstractField(String name) {
        this.name = name;
        this.label = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public boolean isTypeOf(ITTGField f) {
        if (this.type.equals(f.getType())) {
            return true;
        }

        return false;
    }

    public boolean isDataTypeOf(ITTGField f) {
        if (this.getDataType().equals(f.getDataType())) {
            return true;
        }

        return false;
    }
}
