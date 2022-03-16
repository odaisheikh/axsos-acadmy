package com.example.demo.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class BookB {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 300)
	    private String expence;
	    @NotNull
	    @Size(min = 5, max = 300)
	    private String vendore;
	    @NotNull
	    @Min(5)
	    private Integer price;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public BookB() {
	    }
	    
		public BookB(Long id, @NotNull @Size(min = 5, max = 300) String expence,
				@NotNull @Size(min = 5, max = 300) String vendore, @NotNull @Min(5) Integer price) {
			this.id = id;
			this.expence = expence;
			this.vendore = vendore;
			this.price = price;
		}
		

		public BookB(@NotNull @Size(min = 5, max = 300) String expence,
				@NotNull @Size(min = 5, max = 300) String vendore, @NotNull @Min(5) Integer price) {
			super();
			this.expence = expence;
			this.vendore = vendore;
			this.price = price;
		}

		// other getters and setters removed for brevity
		
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExpence() {
			return expence;
		}

		public void setExpence(String expence) {
			this.expence = expence;
		}

		public String getVendore() {
			return vendore;
		}

		public void setVendore(String vendore) {
			this.vendore = vendore;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
