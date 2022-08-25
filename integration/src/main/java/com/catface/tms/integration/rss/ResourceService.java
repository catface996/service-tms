package com.catface.tms.integration.rss;

import com.catface.rss.api.resource.ResourceApi;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/8/25
 */
@Slf4j
@Service
public class ResourceService {

  private final ResourceApi resourceApi;

  public ResourceService(ResourceApi resourceApi) {
    this.resourceApi = resourceApi;
  }

}
