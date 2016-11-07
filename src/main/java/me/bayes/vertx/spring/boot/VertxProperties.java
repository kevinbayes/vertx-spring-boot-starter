package me.bayes.vertx.spring.boot;

import io.vertx.core.VertxOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;


import static io.vertx.core.VertxOptions.*;
/**
 * Created by kevinbayes on 7/11/16.
 */
@ConfigurationProperties(prefix = "spring.boot.ext.vertx")
public class VertxProperties {

    private static final long DEFAULT_WARNING_EXCEPTION_TIME = 5L * 1000 * 1000000;

    private int eventLoopPoolSize = DEFAULT_EVENT_LOOP_POOL_SIZE;
    private int workerPoolSize = DEFAULT_WORKER_POOL_SIZE;
    private int internalBlockingPoolSize = DEFAULT_INTERNAL_BLOCKING_POOL_SIZE;


    private long blockedThreadCheckInterval = DEFAULT_BLOCKED_THREAD_CHECK_INTERVAL;
    private long maxEventLoopExecuteTime = DEFAULT_MAX_EVENT_LOOP_EXECUTE_TIME;
    private long maxWorkerExecuteTime = DEFAULT_MAX_WORKER_EXECUTE_TIME;
    //private ClusterManager clusterManager;
    private boolean haEnabled = DEFAULT_HA_ENABLED;
    private int quorumSize = DEFAULT_QUORUM_SIZE;
    private String haGroup = DEFAULT_HA_GROUP;
   // private MetricsOptions metricsOptions = new MetricsOptions();
    private long warningExceptionTime = DEFAULT_WARNING_EXCEPTION_TIME;
    //private EventBusOptions eventBusOptions = new EventBusOptions();
    //private AddressResolverOptions addressResolverOptions = new AddressResolverOptions();


    public VertxProperties() {
    }


    public int getEventLoopPoolSize() {
        return eventLoopPoolSize;
    }

    public void setEventLoopPoolSize(int eventLoopPoolSize) {
        this.eventLoopPoolSize = eventLoopPoolSize;
    }

    public int getWorkerPoolSize() {
        return workerPoolSize;
    }

    public void setWorkerPoolSize(int workerPoolSize) {
        this.workerPoolSize = workerPoolSize;
    }

    public int getInternalBlockingPoolSize() {
        return internalBlockingPoolSize;
    }

    public void setInternalBlockingPoolSize(int internalBlockingPoolSize) {
        this.internalBlockingPoolSize = internalBlockingPoolSize;
    }

    public long getBlockedThreadCheckInterval() {
        return blockedThreadCheckInterval;
    }

    public void setBlockedThreadCheckInterval(long blockedThreadCheckInterval) {
        this.blockedThreadCheckInterval = blockedThreadCheckInterval;
    }

    public long getMaxEventLoopExecuteTime() {
        return maxEventLoopExecuteTime;
    }

    public void setMaxEventLoopExecuteTime(long maxEventLoopExecuteTime) {
        this.maxEventLoopExecuteTime = maxEventLoopExecuteTime;
    }

    public long getMaxWorkerExecuteTime() {
        return maxWorkerExecuteTime;
    }

    public void setMaxWorkerExecuteTime(long maxWorkerExecuteTime) {
        this.maxWorkerExecuteTime = maxWorkerExecuteTime;
    }

    public boolean isHaEnabled() {
        return haEnabled;
    }

    public void setHaEnabled(boolean haEnabled) {
        this.haEnabled = haEnabled;
    }

    public int getQuorumSize() {
        return quorumSize;
    }

    public void setQuorumSize(int quorumSize) {
        this.quorumSize = quorumSize;
    }

    public String getHaGroup() {
        return haGroup;
    }

    public void setHaGroup(String haGroup) {
        this.haGroup = haGroup;
    }

    public long getWarningExceptionTime() {
        return warningExceptionTime;
    }

    public void setWarningExceptionTime(long warningExceptionTime) {
        this.warningExceptionTime = warningExceptionTime;
    }
}
