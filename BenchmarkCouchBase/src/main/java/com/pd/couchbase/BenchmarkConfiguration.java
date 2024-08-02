package com.pd.couchbase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.mapping.event.ValidatingCouchbaseEventListener;
import org.springframework.data.couchbase.repository.Scope;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.couchbase.client.java.query.QueryScanConsistency;

@Configuration
@EnableCouchbaseRepositories(basePackages={"com.pd.couchbase"})
@Scope("def1")
public class BenchmarkConfiguration extends AbstractCouchbaseConfiguration{

		@Value("${couchbase.url}")
		private String NODE_LIST;

		@Value("${couchbase.bucketname}")
		private String BUCKET_NAME;

		@Value("${couchbase.username}")
		private String BUCKET_USERNAME;

		@Value("${couchbase.password}")
		private String BUCKET_PASSWORD;
		
	    @Override
	    public String getConnectionString() {
	        return NODE_LIST;
	    }

	    @Override
	    public String getUserName() {
	        return BUCKET_USERNAME;
	    }

	    @Override
	    public String getPassword() {
	        return BUCKET_PASSWORD;
	    }

	    @Override
	    public String getBucketName() {
	        return BUCKET_NAME;
	    }

	    @Override
	    public QueryScanConsistency getDefaultConsistency() {
	        return QueryScanConsistency.REQUEST_PLUS;
	    }
	    
	    @Bean
	    public LocalValidatorFactoryBean localValidatorFactoryBean() {
	        return new LocalValidatorFactoryBean();
	    }

	    @Override
		protected String getScopeName() {
			// TODO Auto-generated method stub
			return "def1";
		}

		@Bean
	    public ValidatingCouchbaseEventListener validatingCouchbaseEventListener() {
	        return new ValidatingCouchbaseEventListener(localValidatorFactoryBean());
	    }		
}
