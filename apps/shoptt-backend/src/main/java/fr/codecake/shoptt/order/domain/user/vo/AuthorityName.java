package fr.codecake.shoptt.order.domain.user.vo;

import fr.codecake.shoptt.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
