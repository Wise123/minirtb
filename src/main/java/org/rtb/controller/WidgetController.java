package org.rtb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;

import org.rtb.model.Pageable;
import org.rtb.model.Widget;
import org.rtb.repository.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/widget")
@Api(value = "test", description = "Контроллер для работы с виджетами")
public class WidgetController {

  @Autowired
  WidgetRepository widgetRepository;

  //CHECKSTYLE.OFF: JavadocMethod - здесь за это отвечает сваггер
  @GetMapping("/byFilters")
  @ApiOperation(value = "получить все виджеты")
  public Pageable<List<Widget>> findByFilters(
      //CHECKSTYLE.ON: JavadocMethod
      @RequestParam(required = false)
      @ApiParam(value = "номер страницы (c нуля)")
      Integer page,
      @RequestParam(required = false)
      @ApiParam(value = "размер страницы")
      Integer pageSize,
      @RequestParam(required = false)
      @ApiParam(value = "ось x точки определяющей прямоугольник")
      Integer point1AxisX,
      @RequestParam(required = false)
      @ApiParam(value = "ось y точки определяющей прямоугольник")
      Integer point1AxisY,
      @RequestParam(required = false)
      @ApiParam(value = "ось x точки определяющей прямоугольник")
      Integer point2AxisX,
      @RequestParam(required = false)
      @ApiParam(value = "ось y точки определяющей прямоугольник")
      Integer point2AxisY
  ) {
    return widgetRepository
        .findByFilters(page, pageSize, point1AxisX, point1AxisY, point2AxisX, point2AxisY);
  }

  @GetMapping("/byId/")
  @ApiOperation(value = "получить виджет по идентификатору")
  public Widget findById(
      @RequestParam
      @ApiParam(value = "идентификатор виджета")
          Integer id) {
    return widgetRepository.findById(id);
  }

  @PostMapping("/")
  @ApiOperation(value = "создать виджет")
  public Widget create(
      @RequestBody
      @ApiParam(value = "объект виджета")
          Widget widget) {
    return widgetRepository.create(widget);
  }

  @PutMapping("/")
  @ApiOperation(value = "изменить виджет")
  public Widget update(
      @RequestBody
      @ApiParam(value = "объект виджета")
          Widget widget) {
    return widgetRepository.update(widget);
  }

  @DeleteMapping("/")
  @ApiOperation(value = "удалить виджет")
  public Widget delete(
      @RequestParam
      @ApiParam(value = "идентификатор виджета")
          Integer id) {
    return widgetRepository.remove(id);
  }
}
