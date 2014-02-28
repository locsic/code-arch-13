package projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProcessor {
	public static void createDB() throws ClassNotFoundException
	{
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		
		Connection connection = null;
		try{
			//Create the database connection - will create database if not exists
			connection = DriverManager.getConnection("jdbc:sqlite:codearch.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // timeout to 30
			
			statement.executeUpdate("drop table if exists project");
			statement.executeUpdate("create table projects (id integer, name string, proj_location string, res_location string, processed boolean)");
			
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection !=null)
					connection.close();
			}
			catch(SQLException e)
			{
				System.err.println(e);
			}
		}
	}
	
	public static void createMetaTable(String[] col, String[] val) throws ClassNotFoundException
	{
		
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		
		Connection connection = null;
		try{
			//Create the database connection - will create database if not exists
			connection = DriverManager.getConnection("jdbc:sqlite:codearch.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // timeout to 30
			statement.executeUpdate("drop table if exists metadata");
			statement.executeUpdate("create table metadata (id integer)");
			//Check col.length == val.length
			statement.executeUpdate("alter table metadata add column " + col + " string");			

			statement.executeUpdate("insert into projects values(1, 'hi')");			
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection !=null)
					connection.close();
			}
			catch(SQLException e)
			{
				System.err.println(e);
			}
		}
	}
	
	public static void addMetaData(String col, String val) throws ClassNotFoundException
	{
		
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		
		Connection connection = null;
		try{
			//Create the database connection - will create database if not exists
			connection = DriverManager.getConnection("jdbc:sqlite:codearch.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // timeout to 30
			statement.executeUpdate("drop table if exists metadata");
			statement.executeUpdate("create table metadata (id integer)");
			//Check col.length == val.length
			statement.executeUpdate("alter table metadata add column " + col + " string");			

			statement.executeUpdate("insert into projects values(1, 'hi')");			
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection !=null)
					connection.close();
			}
			catch(SQLException e)
			{
				System.err.println(e);
			}
		}
	}
}
