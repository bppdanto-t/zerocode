package org.jsmart.zerocode.kafka.consume;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server_double_key.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaConsumeIntKeyTest {

    @Test
    @JsonTestCase("kafka/consume/test_kafka_consume_int_key.json")
    public void testKafkaConsume_intKey() throws Exception {
    }

}
