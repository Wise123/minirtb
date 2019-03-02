package org.rtb.repository;

import org.rtb.model.IndexedWidget;
import org.rtb.model.Widget;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Repository
public class WidgetRepository {

  private static Set<Integer> ids = new LinkedHashSet<>();//гарантирует уникальность идентификаторов
  private List<Widget> widgets = new LinkedList<>();//коллекция виджетов, индекс = z

  public List<IndexedWidget> findAll() {
    List<IndexedWidget> indexedWidgets = new LinkedList<>();
    for (int i = 0; i < widgets.size(); i++) {
      indexedWidgets.add(new IndexedWidget(widgets.get(i), i));
    }
    return indexedWidgets;
  }

  public IndexedWidget findById(Integer id) {
    for (int i = 0; i < widgets.size(); i++) {
      if (Objects.equals(widgets.get(i).getId(), id)) {
        return new IndexedWidget(widgets.get(i), i);
      }
    }
    return null;
  }

  public IndexedWidget create(IndexedWidget indexedWidget) {
    Widget widget = new Widget(indexedWidget);
    Integer id = widget.hashCode();
    while (ids.contains(id)) {
      id++;
    }
    ids.add(id);
    widget.setId(id);

    if (indexedWidget.getZ() != null) {
      widgets.add(indexedWidget.getZ(),widget );
    } else {
      widgets.add(widget);
    }
    ids.add(id);
    return findById(id);
  }

  public IndexedWidget update(IndexedWidget widget) {
    for (int i = 0; i < widgets.size(); i++) {
      if (Objects.equals(widgets.get(i).getId(), widget.getId())) {
        widgets.set(i, new Widget(widget));
        return findById(widget.getId());
      }
    }
    throw new RuntimeException("Widget not found");
  }

  public IndexedWidget remove(Integer id) {
    IndexedWidget deletedWidget = findById(id);
    widgets.remove(deletedWidget);
    ids.remove(id);
    return deletedWidget;
  }
}
