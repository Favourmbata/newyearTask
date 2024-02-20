public class AirCondition {
    private boolean isOn;
    private String productName;
    private int temperature;

    public AirCondition(String productName){
        this.productName = productName;
    }

    public void decreaseTemperature(){
        temperature --;
    }

    public void setTemperature (int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public String getProductName(String productName){
        return productName;
    }

    public void increaseTemperature(){
        temperature ++;
    }

    public boolean isOn (){
        return isOn;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

}

