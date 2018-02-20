package dao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;



public class ConnectDB {

	private String url = "jdbc:mysql://localhost/gcp";
	private String user = "root";
	private String passwd = "";
	private Connection conn ;
	private static ConnectDB mycnx ;


	public static int exec(String req) throws SQLException {// cud
		  Connection conn =  ConnectDB.connectionFactory().getConn();
			Statement state = (Statement) conn.createStatement();
			return state.executeUpdate(req);
	}

	public static ResultSet load(String request) throws SQLException{//r ==selet
		Connection conn =  ConnectDB.connectionFactory().getConn();
		Statement state = (Statement) conn.createStatement();
		ResultSet beans = state.executeQuery(request);
		return beans;
	}
	public static ConnectDB connectionFactory(){
		if(mycnx == null )
			mycnx =  new ConnectDB();

		return mycnx;
	}


	private ConnectDB(){

		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection(url, user, passwd);

	} catch (Exception e) {
//		e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERREUR DE CONNEXION A LA BASE DE DONNEES", "ERROR", JOptionPane.ERROR_MESSAGE);
	}
}


	public void loadAssocietedAccount(int id){


	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
       

}