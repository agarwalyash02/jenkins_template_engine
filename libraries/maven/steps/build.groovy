void call(app_name){
    stage('print using echo') {
        node {
            sh 'echo helloStarting'
            println config.envName
            println app_name.eName
        }
        node {
            sh 'echo heyEnding'
        }
    }
}
