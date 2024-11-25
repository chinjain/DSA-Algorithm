package designpattern;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		try {
			
			DatabaseExecutor executor = new DatabaseExecutorProxy("ADMIN");
			executor.executeQuery("DELETE from users");
			
			DatabaseExecutor userExecutor = new DatabaseExecutorProxy("USER");
			userExecutor.executeQuery("SELECT * From Users");
			userExecutor.executeQuery("DELETE from users");
			
		} catch (Exception e) {
			
			System.out.println("Exception Message: " + e.getMessage());
			
		}
	}
}

interface DatabaseExecutor{
	
	void executeQuery(String query) throws Exception;

}

class DatabaseExecutorImpl implements DatabaseExecutor{

	@Override
	public void executeQuery(String query) {
		
		System.out.println("Executing query : {%s}" + query);
		
	}
	
}

class DatabaseExecutorProxy implements DatabaseExecutor{

	private boolean isAdmin;
	private DatabaseExecutorImpl databaseExecutorImpl;
	
	public DatabaseExecutorProxy(String userRole) {
		
		this.isAdmin = userRole.equalsIgnoreCase("ADMIN");
		this.databaseExecutorImpl = new DatabaseExecutorImpl();
	}
	
	
	@Override
	public void executeQuery(String query) throws Exception {
	
		if(isAdmin) {
			databaseExecutorImpl.executeQuery(query);
		}else if(query.toLowerCase().startsWith("delete")) {
			throw new Exception("DELETE not allowed for non-admin users.");
        } else {
            databaseExecutorImpl.executeQuery(query);
        }
		
	}
	
}