package Study;

public class Study {
	private String id;
	private String pwd;
	
	@Override
	public boolean equals(Object obj) {
		Study otherStudy = (Study) obj;
		if (this.getId().equals(otherStudy.getId())) {
			if (this.getPwd().equals(otherStudy.getPwd())) {
				return true;
			}
			
		}
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		GroupMember otherMember = (GroupMember) obj;
//		if (this.getIuid().equals(otherMember.getIuid())) {
//			if (this.getPhone_no().equals(otherMember.getPhone_no())) {
//				return true;
//			}
//		}
//		return false;
//	}
	
//	@Override
//	public String equals(Object obj) {
//		Study otherStudy = (Study) obj;
//		if (this.getId().equals(otherStudy.getId())) {
//			return this.id;
//		}
//		return null;
//	}
	
	public Study() {
	}

	public Study(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	


}
