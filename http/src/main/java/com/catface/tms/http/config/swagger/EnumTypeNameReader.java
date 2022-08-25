package com.catface.tms.http.config.swagger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.catface.common.enums.BaseEnum;
import com.google.common.base.Optional;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.schema.Annotations;
import springfox.documentation.service.ListVendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;
import springfox.documentation.swagger.schema.ApiModelProperties;

/**
 * @author catface
 * @since 2020/5/16
 */
@Component
@Order
public class EnumTypeNameReader implements ModelPropertyBuilderPlugin {

  @Override
  public void apply(ModelPropertyContext context) {
    Optional<ApiModelProperty> annotation = Optional.absent();
    if (context.getAnnotatedElement().isPresent()) {
      annotation = annotation.or(
          ApiModelProperties.findApiModePropertyAnnotation(context.getAnnotatedElement().get()));
    }
    if (context.getBeanPropertyDefinition().isPresent()) {
      annotation = annotation.or(Annotations
          .findPropertyAnnotation(context.getBeanPropertyDefinition().get(), ApiModelProperty.class));
    }
    if (annotation.isPresent()) {
      Class<?> rawPrimaryType = context.getBeanPropertyDefinition().get().getRawPrimaryType();
      if (BaseEnum.class.isAssignableFrom(rawPrimaryType)) {
        BaseEnum[] values = (BaseEnum[])rawPrimaryType.getEnumConstants();
        List<String> desc = Arrays.stream(values).map(BaseEnum::getDesc).collect(Collectors.toList());
        ListVendorExtension<String> descExtension = new ListVendorExtension<>("ex-enum-descriptions", desc);
        context.getBuilder().description(
            annotation.get().value() + String.format("[%s]", rawPrimaryType.getSimpleName())).extensions(
            Collections.singletonList(descExtension));
      }
    }
  }

  @Override
  public boolean supports(DocumentationType documentationType) {
    return true;
  }
}
