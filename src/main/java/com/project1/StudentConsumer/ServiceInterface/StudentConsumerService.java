package com.project1.StudentConsumer.ServiceInterface;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project1.StudentConsumer.Model.Student;
import com.project1.StudentConsumer.config.StudentConsumerConfig;

@Component
public class StudentConsumerService{

	/*
	 * @Autowired StudentConsumerService studentconsumer;
	 */
	
	@RabbitListener(queues="student_request_Queue")
	public void studentConsumerRequest(Student student)
	{
		System.out.println(student.getId()+"  "+student.getName());
         //studentconsumer.studentConsumerRequest(student);
		
	}
}
