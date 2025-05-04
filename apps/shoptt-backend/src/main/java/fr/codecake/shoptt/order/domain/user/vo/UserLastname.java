package fr.codecake.shoptt.order.domain.user.vo;

import fr.codecake.shoptt.shared.error.domain.Assert;

public record UserLastname(String value) {

  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
