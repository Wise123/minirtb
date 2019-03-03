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
@EqualsAndHashCode
public class Widget {
  private Integer id;
  private Integer axisX;
  private Integer axisY;
  //CHECKSTYLE.OFF: MemberName - иначе получится неочевидное имя переменной
  private Integer zIndex;
  //CHECKSTYLE.ON: MemberName
}
