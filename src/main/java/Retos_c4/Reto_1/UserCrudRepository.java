/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Retos_c4.Reto_1;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sandra Milena Gamboa P.
 */
public interface UserCrudRepository extends CrudRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);

}