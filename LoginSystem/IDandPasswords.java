import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("aaa","123");
		logininfo.put("bbb","321");
		logininfo.put("ccc","213");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}