package study.syntax;

public enum OrderTypeEnum {
    ORDER(1000000),
    QUICK_ORDER(1000001),
    CHANGE_ORDER(1000002),
    QUOTE_ORDER(1000003);

    private long typeId;

    OrderTypeEnum(long typeId) {
        this.typeId = typeId;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public static OrderTypeEnum getOrderType(final long typeId) {
        for(OrderTypeEnum ot : OrderTypeEnum.values()) {
            if (ot.getTypeId() == typeId) {
                return ot;
            }
        }
        throw new IllegalArgumentException("wrong typeId");
    }

    public String getOrderType () {
        if (this.typeId == 1000000) {
            return "order";
        }
        return "void";
    }

    public static void main(String[] args) {
        long changeOrderTypeId = OrderTypeEnum.CHANGE_ORDER.getTypeId();
        String orderType = OrderTypeEnum.CHANGE_ORDER.getOrderType();
        OrderTypeEnum orderTypeEnum = OrderTypeEnum.getOrderType(1000000);
        orderTypeEnum.name();
    }

}
