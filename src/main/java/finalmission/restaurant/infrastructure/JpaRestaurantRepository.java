package finalmission.restaurant.infrastructure;

import finalmission.restaurant.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRestaurantRepository extends JpaRepository<Restaurant, Long> {

}
