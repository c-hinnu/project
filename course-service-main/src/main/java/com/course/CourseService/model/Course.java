package com.course.CourseService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    	private String title;
        private String description;

        public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public Course() {
			
		}

		public Course(Long id, String title, String description, List<Topic> topics) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.topics = topics;
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

		public List<Topic> getTopics() {
			return topics;
		}

		public void setTopics(List<Topic> topics) {
			this.topics = topics;
		}

	

        @OneToMany(targetEntity=Topic.class,
                cascade=CascadeType.ALL,
                fetch=FetchType.LAZY,
                orphanRemoval=true
        )
        @JoinColumn(referencedColumnName = "id",name="course_id")

        List<Topic> topics ;
    }



