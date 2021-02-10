package com.ylkget.bootESRestHigh;

import com.ylkget.bootESRestHigh.config.ElasticsearchProperties;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class BootElasticsearchRestHighLevelClientApplicationTests {

	@Resource
	private ElasticsearchProperties elasticsearchProperties;

	@Test
	void contextLoads() {
		System.out.println(elasticsearchProperties);
	}

}
