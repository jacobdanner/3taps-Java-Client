package com.threetaps.client;

import junit.framework.TestCase;

/**
 */
public class BaseTestCase extends TestCase
{
  public static final String API_KEY = System.getenv("3TAPS_API_KEY")!= null ? System.getenv("3TAPS_API_KEY") :"jmrfhu59cnmtnzusshd62pbg";
}
