package com.example.models.tree;

import java.util.Collections;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MemberNode {
  private String memberName;
  private List<? super ValueNode> values;

  public List<? super ValueNode> getValues() {
    return values == null ? Collections.emptyList() : values;
  }
}
