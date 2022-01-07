/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.elsql.ElsqlComponent;

/**
 * Use ElSql to define SQL queries. Extends the SQL Component.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ElsqlComponentBuilderFactory {

    /**
     * ElSQL (camel-elsql)
     * Use ElSql to define SQL queries. Extends the SQL Component.
     * 
     * Category: database,sql
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-elsql
     * 
     * @return the dsl builder
     */
    @Deprecated
    static ElsqlComponentBuilder elsql() {
        return new ElsqlComponentBuilderImpl();
    }

    /**
     * Builder for the ElSQL component.
     */
    interface ElsqlComponentBuilder extends ComponentBuilder<ElsqlComponent> {
        /**
         * To use a vendor specific com.opengamma.elsql.ElSqlConfig.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.elsql.ElSqlDatabaseVendor&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param databaseVendor the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder databaseVendor(
                org.apache.camel.component.elsql.ElSqlDatabaseVendor databaseVendor) {
            doSetProperty("databaseVendor", databaseVendor);
            return this;
        }
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option is a: &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataSource the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder dataSource(javax.sql.DataSource dataSource) {
            doSetProperty("dataSource", dataSource);
            return this;
        }
        /**
         * The resource file which contains the elsql SQL statements to use. You
         * can specify multiple resources separated by comma. The resources are
         * loaded on the classpath by default, you can prefix with
         * &lt;tt&gt;file: to load from file system. Notice you can set this
         * option on the component and then you do not have to configure this on
         * the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param resourceUri the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder resourceUri(java.lang.String resourceUri) {
            doSetProperty("resourceUri", resourceUri);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a specific configured ElSqlConfig. It may be better to use the
         * &lt;tt&gt;databaseVendor option instead.
         * 
         * The option is a:
         * &lt;code&gt;com.opengamma.elsql.ElSqlConfig&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param elSqlConfig the value to set
         * @return the dsl builder
         */
        default ElsqlComponentBuilder elSqlConfig(
                com.opengamma.elsql.ElSqlConfig elSqlConfig) {
            doSetProperty("elSqlConfig", elSqlConfig);
            return this;
        }
    }

    class ElsqlComponentBuilderImpl
            extends
                AbstractComponentBuilder<ElsqlComponent>
            implements
                ElsqlComponentBuilder {
        @Override
        protected ElsqlComponent buildConcreteComponent() {
            return new ElsqlComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "databaseVendor": ((ElsqlComponent) component).setDatabaseVendor((org.apache.camel.component.elsql.ElSqlDatabaseVendor) value); return true;
            case "dataSource": ((ElsqlComponent) component).setDataSource((javax.sql.DataSource) value); return true;
            case "resourceUri": ((ElsqlComponent) component).setResourceUri((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((ElsqlComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((ElsqlComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((ElsqlComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "elSqlConfig": ((ElsqlComponent) component).setElSqlConfig((com.opengamma.elsql.ElSqlConfig) value); return true;
            default: return false;
            }
        }
    }
}