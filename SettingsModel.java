public class SettingsModel {

    private static SettingsModel uniqueInstance;

// other useful instance variables here
    private SettingsModel() {
    }

    private int config1;

    private int wieghtAhad;
    private int heightDalal;
    private int scoreJawaher;
    private int priceShahed;

    public static SettingsModel getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SettingsModel();
        }
        System.out.println("Ahad");
        System.out.println("Dalal");
        System.out.println("Jawaher");
        System.out.println("Shahed");

        return uniqueInstance;
    }
	// other useful methods here

    /* 
     * this function to set port number
     * @param port number
     *
     * 
     */
    public void setConfig1(int con) {
        assert con > 0;
        config1 = con;
    }

    public int getConfig1() {

        return config1;
    }

    public int getWieghtAhad() {
        return wieghtAhad;
    }

    public void setWieghtAhad(int wieghtAhad) {
        assert wieghtAhad > 0;
        if( wieghtAhad > 45 && wieghtAhad < 70)
            System.out.println("Natural wieght");
        else if(wieghtAhad  <45 )
            System.out.println("Under wieght");
        else 
            System.out.println("Over wieght");
        this.wieghtAhad = wieghtAhad;
    }

    public int getHeightDalal() {
        return heightDalal;
    }

    public void setHeightDalal(int heightDalal) {
        assert heightDalal > 0;
        if(heightDalal < 160)
            System.out.println("You are Short");
        else System.out.println("You are Tall");
        this.heightDalal = heightDalal;
    }

    public int getScoreJawaher() {
        return scoreJawaher;
    }

    public void setScoreJawaher(int scoreJawaher) {
        assert scoreJawaher > 0;
        if(scoreJawaher < 60)
            System.out.println("The Student has failed this Subject");
        else System.out.println("The Student has passed this Subject");
        this.scoreJawaher = scoreJawaher;
    }

    public int getPriceShahed() {
        return priceShahed;
    }

    public void setPriceShahed(int priceShahed) {
        assert priceShahed > 0;
        if(priceShahed < 100)
            System.out.println("This item is Cheap");
        else System.out.println("This item is Expensive");
        
        this.priceShahed = priceShahed;
    }

}
