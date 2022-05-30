libraries{
//   merge = true // allow individual apps to contribute additional libraries
//   test-search
    maven {
        envName = "This is ${env.envName}"
    }
}

application_environments{
    dev {
        eName = "dev3"
    }
}

// application_environments {
//         // BITBUCKET = credentials('Bitbucket')
//         // BRANCH_NAME = 'master'
//         ENV_NAME = 'STAG'
//         LOGGLY_TAG = 'STAG'
//         // REDIS_LISTEN_ADDRESS = 'staging-redis.xgwnhr.ng.0001.aps1.cache.amazonaws.com:6379'
//         // REDIS_MAX_IDLE_CONNECTION = '4'
//         // REDIS_MAX_ACTIVE_CONNECTION = '16'
//         // S3_LOCATION_ENV = 'staging'
//         // DATA_PIPELINE = 'data-pipeline-326614.imphoenix_dev1'
//         // ES_USERNAME = 'elastic'
//         // ES_PASSWORD = 'G2u7pDeF9jqOTYTLKGKxc0zv'
//         // ES_CLOUD_ID = 'dev-es:YXAtc291dGgtMS5hd3MuZWxhc3RpYy1jbG91ZC5jb206OTI0MyQ3NTEzM2E0MTZjYzg0ZjA5OWRhY2EzMTM1ZDNkNmMwMCRiNjY3N2NmNGRmMDA0MTE5YmY0OTI1MDcyZGMyOGM4Yg=='
//         // SLACK_WEB_HOOK = 'https://hooks.slack.com/services/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'
// }