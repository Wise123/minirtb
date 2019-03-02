package org.rtb.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class IndexedWidget extends Widget{
  private Integer z;

  public IndexedWidget(Widget widget, Integer z){
    this.setX(widget.getX());
    this.setY(widget.getY());
    this.setId(widget.getId());
    this.setZ(z);
  }
}
