package com.example.models.tree;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberNode {
  private String memberName;
  private List<? super ValueNode> values;
}
