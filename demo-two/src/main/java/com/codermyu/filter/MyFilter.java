package com.codermyu.filter;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/** @author Mingyu */
public class MyFilter implements TypeFilter {
  @Override
  public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
      throws IOException {
    /** 通过metadataReader获取当前正在扫描的类的注解信息 */
    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
    /** 如果当前正在扫描的类标注了@Controller注解，match方法就返回true，否则返回false */
    return annotationMetadata.hasAnnotation(Controller.class.getName());
  }
}
