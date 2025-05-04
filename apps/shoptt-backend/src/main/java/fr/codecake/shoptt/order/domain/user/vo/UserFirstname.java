package fr.codecake.shoptt.order.domain.user.vo;

import fr.codecake.shoptt.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}
