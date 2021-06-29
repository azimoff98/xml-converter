package com.example.models.tree;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class ValueNode extends MemberNode {
  private String value;
}
