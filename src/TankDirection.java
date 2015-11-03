public enum TankDirection {

    UP(1),BOTTOM(2),LEFT(3),RIGHT(4);

    private int value;

    private TankDirection(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
