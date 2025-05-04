package fr.codecake.shoptt.order.domain.user.vo;

import fr.codecake.shoptt.shared.error.domain.Assert;
import fr.codecake.shoptt.shared.error.domain.MissingMandatoryValueException;
import org.jilt.Builder;

@Builder
public record UserAddressToUpdate(UserPublicId userPublicId, UserAddress userAddress) {

  public UserAddressToUpdate {
    Assert.notNull("value", userPublicId);
    Assert.notNull("value", userAddress);
  }
}
