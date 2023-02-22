package chap09;

interface DataBase {
	public void getConnection();
	public String getDBInfo();
}

class Oracle implements DataBase{
	
	boolean conn = false;
	@Override
	public void getConnection() {
		this.conn = true;
	}

	@Override
	public String getDBInfo() {
		return (conn ? "Oracle에 접속되었습니다." : "Oracle에 접속되지 않았습니다.");
	}
	
}

class MsSQL implements DataBase{
	
	boolean conn = false;
	
	@Override
	public void getConnection() {
		this.conn = true;
	}

	@Override
	public String getDBInfo() {
		return (conn ? "MS-SQL에 접속되었습니다." : "MS-SQL에 접속되지 않았습니다.");
	}
	
}

public class Sample08 {
	public static void main(String[] args) {
		//Oracle에 접속합니다.
		DataBase db1 = new Oracle();
		db1.getConnection();
		System.out.println(db1.getDBInfo());
		//MS-SQL에 접속합니다.
		DataBase db2 = new MsSQL();
		System.out.println(db2.getDBInfo());
	}
}


