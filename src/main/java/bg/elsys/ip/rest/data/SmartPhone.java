package bg.elsys.ip.rest.data;

public class SmartPhone {
	private static int countId = 0;
	private int id;
	private String manufacturer;
	private String model;
	private float cameraMP;
	private float procesorGHz;
	private int year;
	private float memoryRam;
	
	public SmartPhone(String manufacturer, String model, float cameraMP,
			float procesorGHz, int year, float memoryRam) {
		super();
		countId++;
		this.id = countId;
		this.manufacturer = manufacturer;
		this.model = model;
		this.cameraMP = cameraMP;
		this.procesorGHz = procesorGHz;
		this.year = year;
		this.memoryRam = memoryRam;
	}

	public SmartPhone() {
		this("", "", 0.0f, 0.0f, 0, 0);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(float cameraMP) {
		this.cameraMP = cameraMP;
	}
	public float getProcesorGHz() {
		return procesorGHz;
	}
	public void setProcesorGHz(float procesorGHz) {
		this.procesorGHz = procesorGHz;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getMemoryRam() {
		return memoryRam;
	}
	public void setMemoryRam(float memoryRam) {
		this.memoryRam = memoryRam;
	}	
}
