package com.aleks.demo.model;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="client_id_seq", initialValue=4, allocationSize=1)
public class Client {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="client_id_seq")
  private Long id;
  private String userName;
  private Long accountNumber;
  private Integer balance;
}

