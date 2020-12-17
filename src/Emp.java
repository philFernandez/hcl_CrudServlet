
public class Emp {
private int id;
private String name,password,email,country, dept, project;
public int getId() {
	return id;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", country=" + country
			+ ", dept=" + dept + ", project=" + project + "]";
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
