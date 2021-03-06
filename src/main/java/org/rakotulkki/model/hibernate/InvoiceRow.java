package org.rakotulkki.model.hibernate;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author jkuittin
 */
@Entity
@Table(name = "invoice_rows")
public class InvoiceRow {

	@Id
	@GeneratedValue
	@Column(columnDefinition = "int")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "invoice_id", columnDefinition = "int")
	private Invoice invoice;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id", columnDefinition = "int", nullable = true)
	private Session session;

	@Column(name = "title")
	private String title;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "vat")
	private Integer vat;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "created")
	private DateTime created;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(final Invoice invoice) {
		this.invoice = invoice;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(final Session session) {
		this.session = session;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public Integer getVat() {
		return vat;
	}

	public void setVat(final Integer vat) {
		this.vat = vat;
	}

	public DateTime getCreated() {
		return created;
	}

	public void setCreated(final DateTime created) {
		this.created = created;
	}
}
