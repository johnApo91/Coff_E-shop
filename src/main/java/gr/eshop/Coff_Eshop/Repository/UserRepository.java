package gr.eshop.Coff_Eshop.Repository;

import gr.eshop.Coff_Eshop.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

}
