/**
 * Copyright 2016 Kevin Bayes
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.bayes.vertx.spring.boot;

import io.vertx.core.buffer.Buffer;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Kevin Bayes
 * @version 0.0.1
 */
@ConfigurationProperties(prefix = "spring.boot.ext.vertx.addressresolver", ignoreUnknownFields = true)
public class VertxAddressResolverProperties {

    private String hostsPath;
    private Buffer hostsValue;
    private String servers;
    private Boolean optResourceEnabled;
    private Integer cacheMinTimeToLive;
    private Integer cacheMaxTimeToLive;
    private Integer cacheNegativeTimeToLive;
    private Long queryTimeout;
    private Integer maxQueries;
    private Boolean rdFlag;
    private String searchDomains;
    private Integer ndots;

    public VertxAddressResolverProperties() {
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public void setHostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
    }

    public Buffer getHostsValue() {
        return hostsValue;
    }

    public void setHostsValue(Buffer hostsValue) {
        this.hostsValue = hostsValue;
    }

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public Boolean getOptResourceEnabled() {
        return optResourceEnabled;
    }

    public void setOptResourceEnabled(Boolean optResourceEnabled) {
        this.optResourceEnabled = optResourceEnabled;
    }

    public Integer getCacheMinTimeToLive() {
        return cacheMinTimeToLive;
    }

    public void setCacheMinTimeToLive(Integer cacheMinTimeToLive) {
        this.cacheMinTimeToLive = cacheMinTimeToLive;
    }

    public Integer getCacheMaxTimeToLive() {
        return cacheMaxTimeToLive;
    }

    public void setCacheMaxTimeToLive(Integer cacheMaxTimeToLive) {
        this.cacheMaxTimeToLive = cacheMaxTimeToLive;
    }

    public Integer getCacheNegativeTimeToLive() {
        return cacheNegativeTimeToLive;
    }

    public void setCacheNegativeTimeToLive(Integer cacheNegativeTimeToLive) {
        this.cacheNegativeTimeToLive = cacheNegativeTimeToLive;
    }

    public Long getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(Long queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    public Integer getMaxQueries() {
        return maxQueries;
    }

    public void setMaxQueries(Integer maxQueries) {
        this.maxQueries = maxQueries;
    }

    public Boolean getRdFlag() {
        return rdFlag;
    }

    public void setRdFlag(Boolean rdFlag) {
        this.rdFlag = rdFlag;
    }

    public String getSearchDomains() {
        return searchDomains;
    }

    public void setSearchDomains(String searchDomains) {
        this.searchDomains = searchDomains;
    }

    public Integer getNdots() {
        return ndots;
    }

    public void setNdots(Integer ndots) {
        this.ndots = ndots;
    }
}
