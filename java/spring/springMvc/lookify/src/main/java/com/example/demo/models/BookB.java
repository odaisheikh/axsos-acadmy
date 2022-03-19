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
@Table(name="lookify")
public class BookB {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 300)
	    private String name;
	    @NotNull
	    @Min(2)
	    private Integer rating;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public BookB() {
	    }
	    

		


		// other getters and setters removed for brevity
		
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }


		public BookB(Long id, String name,Integer rating) {
			this.id = id;
			this.name = name;
			this.rating = rating;
		}





		public BookB(String name,Integer rating) {
			this.name = name;
			this.rating = rating;
		}





		public Long getId() {
			return id;
		}





		public void setId(Long id) {
			this.id = id;
		}





		public String getName() {
			return name;
		}





		public void setName(String name) {
			this.name = name;
		}





		public Integer getRating() {
			return rating;
		}





		public void setRating(Integer rating) {
			this.rating = rating;
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
