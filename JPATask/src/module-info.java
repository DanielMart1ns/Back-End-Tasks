/**
 * 
 */
/**
 * 
 */
module JPATask {
	requires junit;
	requires java.persistence;
	requires org.hibernate.orm.core;
	requires org.postgresql.jdbc;
	exports br.com.daniel.domain;
    opens br.com.daniel.domain to org.hibernate.orm.core;
}