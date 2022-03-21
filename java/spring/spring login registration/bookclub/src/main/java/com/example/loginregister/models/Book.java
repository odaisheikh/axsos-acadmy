package com.example.loginregister.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="books")
public class Book {


		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		    @NotNull
		    @Size(min = 5, max = 200)
		    private String title;
		    @NotNull
		    @Size(min = 5, max = 200)
		    private String description;
		    @NotNull
		    @Size(min = 3, max = 40)
		    private String Name;
		    @NotNull
		    @Size(min = 5, max = 200)
		    private String aName;
		    // This will not allow the createdAt column to be updated after creation
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date createdAt;
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date updatedAt;
		    @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name="user_id")
		    private User user;
		    
		    public Book() {
		    }

			public Book(@NotNull @Size(min = 5, max = 200) String title,
					@NotNull @Size(min = 5, max = 200) String description,
					@NotNull @Size(min = 3, max = 40) String name, @NotNull @Size(min = 5, max = 200) String aName,
					User user) {
				this.title = title;
				this.description = description;
				Name = name;
				this.aName = aName;
				this.user = user;
			}

			public Book(Long id, @NotNull @Size(min = 5, max = 200) String title,
					@NotNull @Size(min = 5, max = 200) String description,
					@NotNull @Size(min = 3, max = 40) String name, @NotNull @Size(min = 5, max = 200) String aName,
					User user) {
				this.id = id;
				this.title = title;
				this.description = description;
				Name = name;
				this.aName = aName;
				this.user = user;
			}
			

			public Book(@NotNull @Size(min = 5, max = 200) String title,
					@NotNull @Size(min = 5, max = 200) String description,
					@NotNull @Size(min = 5, max = 200) String aName, User user) {
				this.title = title;
				this.description = description;
				this.aName = aName;
				this.user = user;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getName() {
				return Name;
			}

			public void setName(String name) {
				Name = name;
			}

			public String getaName() {
				return aName;
			}

			public void setaName(String aName) {
				this.aName = aName;
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

			public User getUser() {
				return user;
			}

			public void setUser(User user) {
				this.user = user;
			}
			@PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
		    @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
			

		    
		    
}
