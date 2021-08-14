package program;

public class Holder extends Address {
	
	private String name;
	private int age;
	private float wage;
	private int cpf;
	private String dateOfBrithday;
	
	
	public Holder (String Name, int AGE, float WAGE, int CPF, String DOB, String CEP )
	{
		name = Name;
		age = AGE;
		wage = WAGE;
		cpf = CPF;
		dateOfBrithday = DOB;
		
		 
		
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
	public int getCPF() {
		return cpf;
	}
	public void setCPF(int cPF) {
		cpf = cPF;
	}
	public String getDateOfBrithday() {
		return dateOfBrithday;
	}
	public void setDateOfBrithday(String dateOfBrithday) {
		this.dateOfBrithday = dateOfBrithday;
	}

	

}
