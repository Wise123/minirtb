package org.rtb.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Widget {
  private Integer id;
  private Integer x;
  private Integer y;

  public Widget(IndexedWidget widget){
    this.setId(widget.getId());
    this.setX(widget.getX());
    this.setY(widget.getY());
  }
}
