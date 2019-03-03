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
public class Pageable<T> {
  T data;
  Integer page;
  Integer pageSize;
  // для проверки того что коллекция не изменилась
  Integer hash;
}
