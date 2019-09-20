package akhil;

public class customer {
	private String name;
	private String address;
	private String contact;
	private String email;
	private String idtype;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	void register()
	{
		System.out.println(getName()+"\n"+getAddress()+"\n"+getContact()+"\n"+getEmail()+"\n"+getIdtype()+"\n"+getId());
	}

}
