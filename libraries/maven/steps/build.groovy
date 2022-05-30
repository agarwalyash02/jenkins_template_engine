void call(){
    if (config.envName == "dev"){
        environment {
            service = 'search-dev'
        }
        stage('print service env'){
            node{
                // sh 'echo env.service'
                echo "hello"
            }
        }
    }
    stage('print using echo') {
        node {
            
            sh 'echo helloStarting'
            println config.envName
        }
        node {
            sh 'echo heyEnding'
            sh 'echo $service'
        }
    }
    
    stage('print env') {
            node {
                sh 'echo byeStarting'
                println config.envName
            }
            node {
                sh 'echo byeeeEnding'
            }
        }
}
