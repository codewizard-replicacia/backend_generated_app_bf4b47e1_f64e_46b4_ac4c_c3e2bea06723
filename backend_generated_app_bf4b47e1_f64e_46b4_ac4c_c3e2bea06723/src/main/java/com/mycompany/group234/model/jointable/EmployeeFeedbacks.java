package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Course;
import com.mycompany.group234.model.Training;
import com.mycompany.group234.model.Employee;
import com.mycompany.group234.model.Feedback;

@Entity(name = "EmployeeFeedbacks")
@Table(schema = "\"generated_app\"", name = "\"EmployeeFeedbacks\"")
@Data
public class EmployeeFeedbacks{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"EmpId\"")
	private Integer empId;

    
    @Column(name = "\"FeedbackId\"")
    private Integer feedbackId;
 
}