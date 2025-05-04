package fr.codecake.shoptt.order.domain.user.aggregate;

import fr.codecake.shoptt.order.domain.user.vo.AuthorityName;
import fr.codecake.shoptt.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

  private AuthorityName name;

  public Authority(AuthorityName authorityName) {
    Assert.notNull("name", authorityName);
    this.name = authorityName;
  }

  public AuthorityName getName() {
    return name;
  }
}
