//package com.fanniemae.cms.cmsportal.utils;
//
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
//import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.StringUtils;
//
//@Configuration
//@EnableDynamoDBRepositories
//        (basePackages = "com.fanniemae.cms.cmsportal.repository")
//public class DynamoDBConfig {
//
//    @Value("${amazon.dynamodb.endpoint}")
//    private String dynamoDbEndpoint;
//
//    @Value("${amazon.aws.accessKey}")
//    private String awsAccessKey;
//
//    @Value("${amazon.aws.secretKey}")
//    private String awsSecretKey;
//
//    @Bean
//    public AmazonDynamoDB amazonDynamoDB() {
//        AmazonDynamoDB amazonDynamoDB
//                = new AmazonDynamoDBClient(amazonAWSCredentials());
//
//        if (!StringUtils.isEmpty(dynamoDbEndpoint)) {
//            amazonDynamoDB.setEndpoint(dynamoDbEndpoint);
//        }
//
//        return amazonDynamoDB;
//    }
//
//    @Bean
//    private AWSCredentials amazonAWSCredentials() {
//        return new BasicAWSCredentials(awsAccessKey, awsSecretKey);
//    }
//
//}
