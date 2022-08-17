package beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.JoinColumn;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="red_gen")
	@SequenceGenerator(name="red_gen" , sequenceName="red_seq")
	private int user_id;
	@Column(length=20)
	private String user_name;
	
	

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="reader_subscriptions", joinColumns= {@JoinColumn(name="user_id")}, inverseJoinColumns= {@JoinColumn(name="SubsId")})
	private Set<SubscriptionEntity>subscriptions;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Set<SubscriptionEntity> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<SubscriptionEntity> subscriptions) {
		this.subscriptions = subscriptions;
	}
	

}
