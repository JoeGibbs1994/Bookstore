package Bookstore.Bookstore1;


@Entity
public class Store{
	
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column (length = 50)
	protected String storeName;
	
	@Column (length = 50)
	protected String location;
	
	@Column (length = 50)
	protected String dateOfBirth;
	
	@Column (length = 50)
	protected String countryOfResidence;