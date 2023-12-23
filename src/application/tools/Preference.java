package application.tools;

public class Preference {
	private String method;
    private String frequency;
    
    public Preference(String method, String frequency) {
        this.method = method;
        this.frequency = frequency;
    }
    
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
