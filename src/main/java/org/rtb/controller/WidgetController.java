package org.rtb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;

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

  @GetMapping("/")
  @ApiOperation(value = "получить все виджеты")
  public List<Widget> findAll() {
    return widgetRepository.findAll();
  }

  @GetMapping("/byId/")
  @ApiOperation(value = "получить виджет по идентификатору")
  public Widget findById(
      @RequestParam
      @ApiParam(defaultValue = "20948701", value = "идентификатор виджета")
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
      @ApiParam(defaultValue = "20948701", value = "идентификатор виджета")
          Integer id) {
    return widgetRepository.remove(id);
  }
}
