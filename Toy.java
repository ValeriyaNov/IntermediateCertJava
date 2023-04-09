public class Toy {
    protected int toyId;
    protected String toyName;
    protected int frequencyLevel;

    public Toy (int toyId, String toyName, int frequencyLevel){
        this.toyId = toyId;
        this.toyName = toyName;
        this.frequencyLevel = frequencyLevel;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getFrequencyLevel() {
        return frequencyLevel;
    }

    public void setFrequencyLevel(int frequencyLevel) {
        this.frequencyLevel = frequencyLevel;
    }

    public void chanceFrequency(){
        if (this.frequencyLevel > 0) {
            this.frequencyLevel -= 1;
        }
    }
    @Override
    public String toString(){
        return "Toy{" +
                "id игрушки=" + toyId +
                ", Наименование игрушки='" + toyName + '\'' +
                ", Уровень частоты выпадения игрушки=" + frequencyLevel +
                '}';
    }
}
