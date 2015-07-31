package beans;
// Generated 02.12.2013 21:28:10 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * TypeUser generated by hbm2java
 */
@Entity
@Table(name = "type_user", schema = "public")
public class TypeUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6689401784234518089L;
	private int usertypeId;
	private String typeOfUserDescription;
	private String typeOfUserPermissions;
	private Set<Users> userses = new HashSet<Users>(0);

	public TypeUser() {
	}


	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="type_of_user_usertype_id_seq", name="type_of_user_usertype_id_seq")
	@GeneratedValue(generator="type_of_user_usertype_id_seq", strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name = "USERTYPE_ID", nullable = false)
	public int getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(int usertypeId) {
		this.usertypeId = usertypeId;
	}

	@Column(name = "TYPE_OF_USER_DESCRIPTION")
	public String getTypeOfUserDescription() {
		return this.typeOfUserDescription;
	}

	public void setTypeOfUserDescription(String typeOfUserDescription) {
		this.typeOfUserDescription = typeOfUserDescription;
	}

	@Column(name = "TYPE_OF_USER_PERMISSION")
	public String getTypeOfUserPermissions() {
		return this.typeOfUserPermissions;
	}

	public void setTypeOfUserPermissions(String typeOfUserPermissions) {
		this.typeOfUserPermissions = typeOfUserPermissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typeUser")
	@Cascade({CascadeType.ALL})
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return typeOfUserDescription;
	}

}
