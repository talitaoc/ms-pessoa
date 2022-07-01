package br.com.pessoa.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pessoa {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String login;
	
	private String email;
	
	private String password;
	
	@CreatedDate
	private LocalDateTime createdAt;
	
}
