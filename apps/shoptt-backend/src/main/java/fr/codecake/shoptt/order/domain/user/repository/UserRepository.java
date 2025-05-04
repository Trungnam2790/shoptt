package fr.codecake.shoptt.order.domain.user.repository;

import fr.codecake.shoptt.order.domain.user.aggregate.User;
import fr.codecake.shoptt.order.domain.user.vo.UserAddressToUpdate;
import fr.codecake.shoptt.order.domain.user.vo.UserEmail;
import fr.codecake.shoptt.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public interface UserRepository {

  void save(User user);

  Optional<User> get(UserPublicId userPublicId);

  Optional<User> getOneByEmail(UserEmail userEmail);

  void updateAddress(UserPublicId userPublicId, UserAddressToUpdate userAddress);

}
