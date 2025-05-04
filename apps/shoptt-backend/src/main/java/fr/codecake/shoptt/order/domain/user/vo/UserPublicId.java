package fr.codecake.shoptt.order.domain.user.vo;

import fr.codecake.shoptt.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {
    Assert.notNull("value", value);
  }
}
