/**
 * 
 */
package beanClass;

/**
 * @author ksinha
 *
 */
public class CustomerBean {
	
	private int id;
	private String cname;
	
	/*public CustomerConn() {
		
	}*/	
	public CustomerBean(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}		
	

}
