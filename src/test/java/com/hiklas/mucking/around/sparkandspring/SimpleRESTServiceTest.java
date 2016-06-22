package com.hiklas.mucking.around.sparkandspring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class SimpleRESTServiceTest {

  private SimpleRESTService instanceToTest;

  @Before
  public void before() {
    this.instanceToTest = new SimpleRESTService();
  }

  @Test
  public void testIsSparkApplication() {
    assertThat(instanceToTest, instanceOf(spark.servlet.SparkApplication.class));
  }


}