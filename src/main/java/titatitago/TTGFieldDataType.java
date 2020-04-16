package titatitago;

public enum TTGFieldDataType {
    STRING("STRING"),

    //双精度类型
    NUMBER("NUMBER"),
    BOOL("BOOL"),
    ARRAY("ARRAY"),
    OBJECT("OBJECT"),

    //时间戳类型，实际底层为64int
    TIMESTAMP("TIMESTAMP");

    private String name;
    TTGFieldDataType(String name) {
        this.name = name;
    }
}
