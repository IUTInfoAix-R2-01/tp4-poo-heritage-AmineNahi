package YAIP7;

public class Customer {
	private String name;
	private boolean member = false;
	private String memberString;
	
	public Customer(String name) {
		this.name = name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberString() {
		return memberString;
	}

	public void setMemberString(String memberString) {
		this.memberString = memberString;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberString=" + memberString + "]";
	}
	
	
}
