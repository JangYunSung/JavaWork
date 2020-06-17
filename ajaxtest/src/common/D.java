package common;


	public class D {
		public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";  
		public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";  
		public static final String USERID = "scott0316";  
		public static final String USERPW = "tiger0316";
		
		public static final String SQL_WRITE_SELECT = 
				"SELECT * FROM test_write ORDER BY wr_uid DESC"; 

		public static final String SQL_WRITE_INSERT = "INSERT INTO test_write " +
			"(wr_uid, wr_subject, wr_content, wr_name) " +
			"VALUES(test_write_seq.nextval, ?, ?, ?)";

		public static final String SQL_WRITE_INC_VIEWCNT =  
				"UPDATE test_write SET wr_viewcnt = wr_viewcnt + 1 WHERE wr_uid = ?";

		public static final String SQL_WRITE_SELECT_BY_UID = 
				"SELECT * FROM test_write WHERE wr_uid = ?";

		public static final String SQL_WRITE_UPDATE = 
				"UPDATE test_write SET wr_subject = ?, wr_content = ? WHERE wr_uid = ?";

		public static final String SQL_WRITE_DELETE_BY_UID = 
				"DELETE FROM test_write WHERE wr_uid = ?";
		
		
		public static final String SQL_WRITE_COUNT_ALL = 
				"SELECT count(*) FROM test_write";
		
		public static final String SQL_WRITE_SELECT_FROM_ROW = 
				"SELECT * FROM " + 
				"(SELECT ROWNUM AS RNUM, T.* FROM (SELECT * FROM test_write ORDER BY wr_uid DESC) T) " + 
				"WHERE RNUM >= ? AND RNUM < ?";

	}
	
	
	
	
