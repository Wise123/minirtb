package org.rtb.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.rtb.model.Widget;

public class WidgetRepository {
  private List<Widget> widgets = new LinkedList<>();//коллекция виджетов, индекс = z

  /**
   * получить все виждеты.
   *
   * @return список виджетов
   */
  public List<Widget> findAll() {
    return widgets;
  }

  /**
   * получить виджет по идентфикатору.
   *
   * @param id идентфикатор виджета
   * @return виджет
   */
  public Widget findById(Integer id) {
    for (Widget widget : widgets) {
      if (Objects.equals(widget.getId(), id)) {
        return widget;
      }
    }
    return null;
  }

  /**
   * создать виджет.
   *
   * @param widget виджет
   * @return созданный виджет
   */
  public Widget create(Widget widget) {
    List<Integer> ids =
        widgets
        .stream()
        .map(Widget::getId)
        .collect(Collectors.toList());
    Integer id = widget.hashCode();
    while (ids.contains(id)) {
      id++;
    }
    ids.add(id);
    widget.setId(id);

    List<Integer> indexes = widgets.stream()
        .map(Widget::getZIndex)
        .sorted(Integer::compare)
        .collect(Collectors.toList());

    if (widget.getZIndex() != null) {
      for (Widget i :widgets) {
        if (i.getZIndex() >= widget.getZIndex()) {
          i.setZIndex(i.getZIndex() + 1);
        }
      }
      widgets.add(widget);
    } else {
      if (widgets.size() != 0) {
        widget.setZIndex(indexes.get(indexes.size() - 1) + 1);
      } else {
        widget.setZIndex(0);
      }
      widgets.add(widget);
    }
    ids.add(id);
    return findById(id);
  }

  /**
   * обновить существующий виджет.
   *
   * @param widget виджет
   * @return обновлённый виджет
   */
  public Widget update(Widget widget) {
    for (int i = 0; i < widgets.size(); i++) {
      if (Objects.equals(widgets.get(i).getId(), widget.getId())) {
        widgets.set(i, widget);
        return findById(widget.getId());
      }
    }
    return null;
  }

  /**
   * удалить виджет.
   *
   * @param id идентификатор виджета
   * @return удалённый виджет
   */
  public Widget remove(Integer id) {
    Widget deletedWidget = findById(id);
    widgets.remove(deletedWidget);
    return deletedWidget;
  }
}
