package br.DesafioDio.springboot.repositorieis;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DesafioDio.springboot.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
