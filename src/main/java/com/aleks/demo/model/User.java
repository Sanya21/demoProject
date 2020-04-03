package com.aleks.demo.model;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  private Long id;
  private String userName;
  private Long accountNumber;
  private Integer balance;
}

