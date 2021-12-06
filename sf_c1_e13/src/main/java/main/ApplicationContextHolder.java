package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextHolder {

  private ApplicationContext applicationContext;

  private ApplicationContextHolder() {
    applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
  }

  private static final class ApplicationContextSingletonHolder {
    private static ApplicationContextHolder INSTANCE = new ApplicationContextHolder();
  }

  public static final ApplicationContextHolder getInstance() {
    return ApplicationContextSingletonHolder.INSTANCE;
  }

  public ApplicationContext getApplicationContext() {
    return applicationContext;
  }
}
