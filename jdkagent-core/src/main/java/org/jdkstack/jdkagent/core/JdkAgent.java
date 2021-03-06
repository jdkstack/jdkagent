package org.jdkstack.jdkagent.core;

import java.lang.instrument.Instrumentation;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdkstack.jdkagent.api.Agent;

/**
 * 用于增强任意方法(包括JDK类,JVM已经加载的类). 记录方法执行的时间,输入参数, 输出参数.
 *
 * @author Admin
 */
public final class JdkAgent implements Agent {

  /** . */
  private static final Logger LOGGER = Logger.getLogger(JdkAgent.class.getName());

  private JdkAgent() {
    //
  }

  /**
   * 在入口main方法之前执行.
   *
   * @param agentArgs 探针参数.
   * @param inst 增强基础类.
   */
  public static void premain(final String agentArgs, final Instrumentation inst) {
    LOGGER.log(Level.INFO, "Agent Premain Args: {0}", agentArgs);
    inst.addTransformer(new JdkTransformer());
  }
}
