package me.elvira.demo.repositories;

import me.elvira.demo.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users,Long>
{

}